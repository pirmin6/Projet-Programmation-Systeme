package com.gabz.projetcuisine.model.common.textile;

public abstract class Textile {

    protected boolean propre = true;

    public Textile() {
        this.propre = false;
    }

    public boolean isPropre() {
        return propre;
    }

    public void setPropre(boolean propre) {
        this.propre = propre;
    }
}
