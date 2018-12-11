package com.gabz.projetcuisine.model.cuisine.repas;

import com.gabz.projetcuisine.model.cuisine.materiel.Materiel;

import javax.persistence.*;
import java.util.List;

@Entity
public class EtapeRecette {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String description;
    private boolean faisableParPersonnelBasique;
    private int tempsRealisation;
    private int nbrEtape;
    @OneToMany(cascade = CascadeType.ALL)
    private List<String> materiels;
    private boolean faisableEnSimultanée;

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isFaisableParPersonnelBasique() {
        return faisableParPersonnelBasique;
    }

    public int getTempsRealisation() {
        return tempsRealisation;
    }

    public int getNbrEtape() {
        return nbrEtape;
    }

    public List<String> getMateriels() {
        return materiels;
    }

    public boolean isFaisableEnSimultanée() {
        return faisableEnSimultanée;
    }

    public EtapeRecette(String description, boolean faisableParPersonnelBasique, int tempsRealisation,
                        int nbrEtape, List<String> materiels, boolean faisableEnSimultanée) {
        this.description = description;
        this.faisableParPersonnelBasique = faisableParPersonnelBasique;
        this.tempsRealisation = tempsRealisation;
        this.nbrEtape = nbrEtape;
        this.materiels = materiels;
        this.faisableEnSimultanée = faisableEnSimultanée;
    }
}
