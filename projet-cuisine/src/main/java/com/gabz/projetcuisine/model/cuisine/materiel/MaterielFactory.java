package com.gabz.projetcuisine.model.cuisine.materiel;

public class MaterielFactory {

    private static MaterielFactory materielFactory = new MaterielFactory();

    public static MaterielFactory getMaterielFactory() {
        return materielFactory;
    }

    private MaterielFactory() {

    }

    public Materiel getMateriel(String materiel) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        return (Materiel) Class.forName(materiel).newInstance();
    }
}
