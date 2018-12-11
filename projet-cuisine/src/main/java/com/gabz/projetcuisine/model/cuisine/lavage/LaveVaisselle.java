package com.gabz.projetcuisine.model.cuisine.lavage;

import com.gabz.projetcuisine.model.common.vaisselle.Vaisselle;
import com.gabz.projetcuisine.model.common.vaisselle.assiette.Assiette;
import com.gabz.projetcuisine.model.common.vaisselle.couvert.Couteau;
import com.gabz.projetcuisine.model.common.vaisselle.couvert.CuillereCafe;
import com.gabz.projetcuisine.model.common.vaisselle.couvert.CuillereSoupe;
import com.gabz.projetcuisine.model.common.vaisselle.couvert.Fourchette;
import com.gabz.projetcuisine.model.common.vaisselle.verre.Verre;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;

public class LaveVaisselle extends Observable {

    private static LaveVaisselle instance = new LaveVaisselle();
    private List<? extends Vaisselle> assiettes = new ArrayList<Assiette>();
    private List<? extends Vaisselle> verres = new ArrayList<Verre>();
    private List<? extends Vaisselle> fourchettes = new ArrayList<Fourchette>();
    private List<? extends Vaisselle> couteaux = new ArrayList<Couteau>();
    private List<? extends Vaisselle> cuillereSoupes = new ArrayList<CuillereSoupe>();
    private List<? extends Vaisselle> cuillereCafes = new ArrayList<CuillereCafe>();


    private LaveVaisselle() {}

    public static LaveVaisselle getInstance() {
        return instance;
    }

    public List<? extends Vaisselle> getAssiettes() {
        return assiettes;
    }

    public List<? extends Vaisselle> getVerres() {
        return verres;
    }

    public List<? extends Vaisselle> getFourchettes() {
        return fourchettes;
    }

    public List<? extends Vaisselle> getCouteaux() {
        return couteaux;
    }

    public List<? extends Vaisselle> getCuillereSoupes() {
        return cuillereSoupes;
    }

    public List<? extends Vaisselle> getCuillereCafes() {
        return cuillereCafes;
    }

    public synchronized void remplirLaveVaisselle(List<Vaisselle> vaisselle) throws NoSuchFieldException, IllegalAccessException {

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

    public synchronized boolean ajouterVaisselle(String string, Vaisselle vaisselle) throws NoSuchFieldException, IllegalAccessException {

        // Get the specific field to the vaisselle Item class
        Field field = this.getClass().getDeclaredField(string);
        field.setAccessible(true);
        List<Vaisselle> startingField = (List<Vaisselle>) field.get(this);

        // variable used to know if the element was added or not
        boolean vaisselleAdded = false;

        if (!(startingField.size() > 24)) {
            vaisselleAdded = true;
            startingField.add(vaisselle);
        }

        //update the field
        field.set(this, startingField);

        return vaisselleAdded;
    }

    public synchronized void demarrerLavage() {

        List<Vaisselle> vaisselle = new ArrayList<>();
        vaisselle.addAll(assiettes);
        vaisselle.addAll(verres);
        vaisselle.addAll(fourchettes);
        vaisselle.addAll(cuillereCafes);
        vaisselle.addAll(cuillereSoupes);
        vaisselle.addAll(couteaux);


        for (Vaisselle v: vaisselle) {
            if (v != null)
            v.setPropre(true);
        }
    }

    public synchronized List<Vaisselle> viderLaveVaisselle() {

        List<Vaisselle> vaisselle = new ArrayList<>();
        vaisselle.addAll(assiettes);
        vaisselle.addAll(verres);
        vaisselle.addAll(fourchettes);
        vaisselle.addAll(cuillereCafes);
        vaisselle.addAll(cuillereSoupes);
        vaisselle.addAll(couteaux);

        couteaux.clear();
        fourchettes.clear();
        assiettes.clear();
        cuillereSoupes.clear();
        cuillereCafes.clear();
        verres.clear();

        return vaisselle;
    }

}
