package com.gabz.projetcuisine;

import com.gabz.projetcuisine.model.cuisine.materiel.Materiel;
import com.gabz.projetcuisine.model.cuisine.repas.*;
import com.gabz.projetcuisine.repository.RecetteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CocoCuisto {

    @Autowired
    private RecetteRepository recetteRepository;

    List<EtapeRecette> listeEtapesRecette = new ArrayList<>();

    public void feuilleteaucrabe() {
        List<Materiel> four = new ArrayList<>();
        List<Materiel> mixeur = new ArrayList<>();


        List<IngredientRecord> feuillete_etape1_ingredients = new ArrayList<>();

        IngredientRecord crabe = new IngredientRecord(new Ingredient("crabe", TypeIngredient.AUTRE), 1, 1);
        Ingredient piment = new Ingredient("piment", TypeIngredient.LEGUME);
        Ingredient citron = new Ingredient("citron", TypeIngredient.FRUIT);
        Ingredient chapelure = new Ingredient("chapelure", TypeIngredient.AUTRE);
        Ingredient herbes = new Ingredient("herbes", TypeIngredient.AUTRE);

        feuillete_etape1_ingredients

        EtapeRecette feuillete_etape1 = new EtapeRecette("Préchauffer le four à 230° (th 7-8)", false, 30, 1, four, null, true);
        EtapeRecette feuillete_etape2 = new EtapeRecette("Mélanger la chair de crabe, le jus de citron, la chapelure, les herbes et le piment", false, 120, 2, mixeur, herbes, false);
    }


}
