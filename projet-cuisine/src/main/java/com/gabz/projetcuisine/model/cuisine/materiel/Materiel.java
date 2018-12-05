package com.gabz.projetcuisine.model.cuisine.materiel;

public abstract class Materiel {

    protected double tempsLavage;
    protected boolean propre = true;

    public Materiel() {
        this.propre = false;
    }

    public boolean isPropre() {
        return propre;
    }

    public void laverMateriel() throws InterruptedException {
        Thread.sleep((long) tempsLavage * 1000);
    }

    public abstract void remettreEnService();
}
