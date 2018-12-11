package com.gabz.projetcuisine;

import com.gabz.projetcuisine.model.cuisine.materiel.CouteauCuisine;
import com.gabz.projetcuisine.model.cuisine.materiel.Materiel;
import com.gabz.projetcuisine.model.cuisine.materiel.Poele;
import com.gabz.projetcuisine.model.cuisine.repas.*;
import com.gabz.projetcuisine.repository.RecetteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CocoCuisto {

    // BUREAU DES SPORTS BUREAU DES SPORTS BUREAU DES SPORTS

    @Autowired
    private RecetteRepository recetteRepository;

    public void poulet() throws InterruptedException {

        List<EtapeRecette> listeEtapesRecette = new ArrayList<>();

        //ON CREEE LA LISTE DES INGREDIENTS POUR LA RECETTE ESPECE DE GROS DEBILE
        List<IngredientRecord> ingredientRecords = new ArrayList<>();

        ingredientRecords.add(new IngredientRecord(new Ingredient("Poulet", TypeIngredient.VIANDE),1,1));
        ingredientRecords.add(new IngredientRecord(new Ingredient("huile OLIVE", TypeIngredient.AUTRE), 1, 1));

        //Etape 1
        //DABORD LE MATERIEL
        List<Materiel> materielEtape1 = new ArrayList<>();

        // ENSUITE ON CREE LETAPE
        materielEtape1.add(new CouteauCuisine());
        EtapeRecette etape1 = new EtapeRecette("Couper le poulet en lamelles", true, 60, 1,
                materielEtape1, false);

        // Etape 2 ON FAIT PAREIL
        List<Materiel> materielEtape2 = new ArrayList<>();
        materielEtape1.add(new Poele());
        EtapeRecette etape2 = new EtapeRecette("Cuire le poulet à la poele", false, 240, 2
                , materielEtape2, true);

        // JAJOUTE LES ETAPES CREEE A LA LISTE GROS LOURDEAU
        listeEtapesRecette.add(etape1);
        listeEtapesRecette.add(etape2);

        // GNEUFDSFDSFS ET ENSUITE ON CREEE LA RECETTE
        Recette recette = new Recette("Poulet à la poele", listeEtapesRecette, ingredientRecords, false, TypeRecette.PLAT);

        // HOHOHO ON SAUVEGARDE LA RECETTE
        recetteRepository.save(recette);
    }

}
