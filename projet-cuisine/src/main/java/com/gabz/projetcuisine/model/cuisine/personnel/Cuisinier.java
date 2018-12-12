package com.gabz.projetcuisine.model.cuisine.personnel;

import com.gabz.projetcuisine.model.cuisine.materiel.Materiel;
import com.gabz.projetcuisine.model.cuisine.materiel.MaterielFactory;
import com.gabz.projetcuisine.model.cuisine.repas.EtapeRecette;

import java.util.ArrayList;
import java.util.List;

public abstract class Cuisinier {

    public synchronized void faireEtapeRecette(EtapeRecette etapeRecette)
            throws InterruptedException, IllegalAccessException, InstantiationException, ClassNotFoundException {
        List<Materiel> materielEtape = new ArrayList<>();

        for (String s : etapeRecette.getMateriels()) {
            materielEtape.add(MaterielFactory.getMaterielFactory().getMateriel(s));
        }

        Thread.sleep(etapeRecette.getTempsRealisation());

        for (Materiel materiel : materielEtape) {
            materiel.poserSurEvier();
        }
    }
}
