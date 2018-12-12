package com.gabz.projetcuisine.model.cuisine.personnel;

import com.gabz.projetcuisine.model.common.StockageVaisselleTextile;
import com.gabz.projetcuisine.model.cuisine.lavage.Evier;
import com.gabz.projetcuisine.model.cuisine.lavage.LaveLinge;
import com.gabz.projetcuisine.model.cuisine.lavage.LaveVaisselle;
import com.gabz.projetcuisine.model.cuisine.repas.EtapeRecette;

import java.util.Observable;
import java.util.Observer;

public class Plongeur extends Cuisinier implements Observer {

    private static Plongeur instance = new Plongeur();
    private Evier evier;
    private LaveLinge laveLinge;
    private LaveVaisselle laveVaisselle;

    private Plongeur() {

        // Instancier les elements utilisés par le plongeur
        evier = Evier.getInstance();
        laveLinge = LaveLinge.getInstance();
        laveVaisselle = LaveVaisselle.getInstance();

        // Ajouter le plongeur en tant qu'observer pour les elements necessaires
        evier.addObserver(this);
        laveLinge.addObserver(this);
        laveVaisselle.addObserver(this);
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

    public synchronized void laverMateriel() throws InterruptedException {

        evier.demarrerLavage();
    }

    public synchronized void laverTextile() throws InterruptedException {

        laveLinge.demarrerLavage();
    }

    public synchronized void laverVaisselle() {

        laveVaisselle.demarrerLavage();
    }

    public synchronized void chargerLaveVaisselle(StockageVaisselleTextile stock) throws NoSuchFieldException, IllegalAccessException {

        laveVaisselle.remplirLaveVaisselle(stock.prendreVaisselle());
    }

    public synchronized void viderLaveVaisselle(StockageVaisselleTextile stockPropre) throws InterruptedException {

        Thread.sleep(60000);
        stockPropre.addVaisselle(laveVaisselle.viderLaveVaisselle());
    }

    public synchronized void chargerLaveLinge(StockageVaisselleTextile stock) throws InterruptedException {

        laveLinge.remplirEtViderLaveLinge(stock.prendreTextile());
    }

    public synchronized void viderLaveLinge(StockageVaisselleTextile stockPropre) throws InterruptedException {

        Thread.sleep(6000);
        stockPropre.addTextile(laveLinge.viderLageLinge());
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
