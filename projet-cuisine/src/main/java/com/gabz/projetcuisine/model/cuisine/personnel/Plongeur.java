package com.gabz.projetcuisine.model.cuisine.personnel;

import com.gabz.projetcuisine.model.common.StockageVaisselleTextile;
import com.gabz.projetcuisine.model.cuisine.lavage.Evier;
import com.gabz.projetcuisine.model.cuisine.lavage.LaveLinge;
import com.gabz.projetcuisine.model.cuisine.lavage.LaveVaisselle;
import com.gabz.projetcuisine.model.cuisine.repas.EtapeRecette;

import java.util.Observable;
import java.util.Observer;

public class Plongeur implements ICuisinier, Observer {

    private static Plongeur instance = new Plongeur();
    private Evier evier;
    private LaveLinge laveLinge;
    private LaveVaisselle laveVaisselle;

    private Plongeur() {

        evier = Evier.getInstance();
        laveLinge = LaveLinge.getInstance();
        laveVaisselle = LaveVaisselle.getInstance();
    }

    public Evier getEvier() {
        return evier;
    }

    public LaveLinge getLaveLinge() {
        return laveLinge;
    }

    public LaveVaisselle getLaveVaisselle() {
        return laveVaisselle;
    }

    public static Plongeur getInstance() {
        return instance;
    }

    public void laverMateriel() throws InterruptedException {

        evier.demarrerLavage();
    }

    public void laverTextile() throws InterruptedException {

        laveLinge.demarrerLavage();
    }

    public void laverVaisselle() {

        laveVaisselle.demarrerLavage();
    }

    public void chargerLaveVaisselle(StockageVaisselleTextile stock) {

        stock.prendreVaisselle();
    }

    public void viderLaveVaisselle() {

    }

    public void chargerLaveLinge(StockageVaisselleTextile stock) {

    }

    public void viderLaveLinge() {

    }

    @Override
    public void faireEtapeRecette(EtapeRecette etapeRecette) {

    }

    @Override
    public void update(Observable o, Object arg) {

        synchronized (this) {

            if (o instanceof Evier) {
                try {
                    laverMateriel();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else if (o instanceof LaveLinge) {
                try {
                    laverTextile();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else if (o instanceof LaveVaisselle) {
                laverVaisselle();
            }
        }
    }
}
