package com.gabz.projetcuisine.model.cuisine.lavage;

import com.gabz.projetcuisine.model.common.vaisselle.Vaisselle;
import com.gabz.projetcuisine.model.common.vaisselle.assiette.Assiette;
import com.gabz.projetcuisine.model.common.vaisselle.couvert.Couteau;
import com.gabz.projetcuisine.model.common.vaisselle.couvert.CuillereCafe;
import com.gabz.projetcuisine.model.common.vaisselle.couvert.CuillereSoupe;
import com.gabz.projetcuisine.model.common.vaisselle.couvert.Fourchette;
import com.gabz.projetcuisine.model.common.vaisselle.verre.Verre;
import com.gabz.projetcuisine.util.ListUtil;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LaveVaisselle {

    private static LaveVaisselle instance = new LaveVaisselle();
    private Vaisselle[] assiettes = new Assiette[24];
    private Vaisselle[] verres = new Verre[24];
    private Vaisselle[] fourchettes = new Fourchette[24];
    private Vaisselle[] couteaux = new Couteau[24];
    private Vaisselle[] cuillereSoupes = new CuillereSoupe[24];
    private Vaisselle[] cuillereCafes = new CuillereCafe[24];


    private LaveVaisselle() {}

    public static LaveVaisselle getInstance() {
        return instance;
    }

    public Vaisselle[] getAssiettes() {
        return assiettes;
    }

    public Vaisselle[] getVerres() {
        return verres;
    }

    public Vaisselle[] getFourchettes() {
        return fourchettes;
    }

    public Vaisselle[] getCouteaux() {
        return couteaux;
    }

    public Vaisselle[] getCuillereSoupes() {
        return cuillereSoupes;
    }

    public Vaisselle[] getCuillereCafes() {
        return cuillereCafes;
    }

    public void remplirLaveVaisselle(List<Vaisselle> vaisselle) throws NoSuchFieldException, IllegalAccessException {

        List<Vaisselle> vaisselleRestante = new ArrayList<>();

        Iterator it = vaisselle.iterator();
        while (it.hasNext()) {

            Vaisselle currentVaisselle = (Vaisselle) it.next();

            if (currentVaisselle.getClass().equals(Couteau.class))
                if (!ajouterVaisselle("couteaux", currentVaisselle)) {
                    vaisselleRestante.add(currentVaisselle);
                }

            if (currentVaisselle.getClass().equals(Fourchette.class))
                if (!ajouterVaisselle("fourchettes", currentVaisselle)) {
                    vaisselleRestante.add(currentVaisselle);
                }

            if (currentVaisselle.getClass().equals(CuillereCafe.class))
                if (!ajouterVaisselle("cuillereCafes", currentVaisselle)) {
                    vaisselleRestante.add(currentVaisselle);
                }

            if (currentVaisselle.getClass().equals(CuillereSoupe.class))
                if(!ajouterVaisselle("cuillereSoupes", currentVaisselle)) {
                    vaisselleRestante.add(currentVaisselle);
                }

            if (Verre.class.isAssignableFrom(currentVaisselle.getClass()))
                if (!ajouterVaisselle("verres", currentVaisselle)) {
                    vaisselleRestante.add(currentVaisselle);
                }

            if (Assiette.class.isAssignableFrom(currentVaisselle.getClass()))
                if (!ajouterVaisselle("assiettes", currentVaisselle)) {
                    vaisselleRestante.add(currentVaisselle);
                }

        }
    }

    public boolean ajouterVaisselle(String string, Vaisselle vaisselle) throws NoSuchFieldException, IllegalAccessException {

        // Get the specific field to the vaisselle Item class
        Field field = this.getClass().getDeclaredField(string);
        field.setAccessible(true);
        Vaisselle[] startingField = (Vaisselle[]) field.get(this);

        // variable used to know if the element was added or not
        boolean vaisselleAdded = false;

        for (int i = 0; i < startingField.length; i++) {

            if (startingField[i] == null) {
                startingField[i] = vaisselle;
                vaisselleAdded = true;

                // escape la boucle si on a placé l'item
                i = startingField.length;
            }
        }

        //update the field
        field.set(this, startingField);

        return vaisselleAdded;
    }

    public void demarrerLavage() {

    }

    public void viderLaveVaisselle() {

    }

}
