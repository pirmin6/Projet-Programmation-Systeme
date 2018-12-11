package com.gabz.projetcuisine;

import com.gabz.projetcuisine.model.cuisine.materiel.*;
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

    public void feuilletecrabe() throws InterruptedException {

        List<EtapeRecette> listeEtapesRecette = new ArrayList<>();

        List<IngredientRecord> IngredientRecords = new ArrayList<>();

        IngredientRecords.add(new IngredientRecord(new Ingredient("crabe", TypeIngredient.AUTRE), 1, 10));
        IngredientRecords.add(new IngredientRecord(new Ingredient("piment", TypeIngredient.LEGUME), 1, 20));
        IngredientRecords.add(new IngredientRecord(new Ingredient("persil", TypeIngredient.AUTRE), 1, 20));
        IngredientRecords.add(new IngredientRecord(new Ingredient("oeufs", TypeIngredient.AUTRE), 2, 20));
        IngredientRecords.add(new IngredientRecord(new Ingredient("pate feuilleté", TypeIngredient.AUTRE), 4, 20));
        IngredientRecords.add(new IngredientRecord(new Ingredient("huile", TypeIngredient.AUTRE), 1, 20));
        IngredientRecords.add(new IngredientRecord(new Ingredient("oignons", TypeIngredient.LEGUME), 1, 20));
        IngredientRecords.add(new IngredientRecord(new Ingredient("citron", TypeIngredient.FRUIT), 1, 20));
        IngredientRecords.add(new IngredientRecord(new Ingredient("crème fraiche", TypeIngredient.AUTRE), 1, 20));


        List<Materiel> materielEtape1 = new ArrayList<>();
        materielEtape1.add(new BolSalade());
        EtapeRecette etape1 = new EtapeRecette("Mélanger la chair de crabe, le jus de citron, la chapelure, les herbes et le piment\n" +
                "Lier le tout avec un œuf", false, 60, 1, materielEtape1, false);

        List<Materiel> materielEtape2 = new ArrayList<>();
        materielEtape2.add(new CouteauCuisine());
        EtapeRecette etape2 = new EtapeRecette("Découper 4 disques dans la pâte feuilletée et répartir la farce sur la moitié de chaque disque, en laissant 1 cm de rebord", false, 60, 2, materielEtape2, false);

        EtapeRecette etape3 = new EtapeRecette("Rabattre l'autre moitié et souder", false, 60, 3, null, false);

        EtapeRecette etape4 = new EtapeRecette("Badigeonner les feuilletés avec un oeuf battu et salé, puis strier avec une fourchette", true, 60, 4, null, false);


        List<Materiel> materielEtape5 = new ArrayList<>();
        materielEtape5.add(new Four());
        EtapeRecette etape5 = new EtapeRecette("Mettre au four à 180° (th 6) pendant 20mn minimum", true, 1200, 5, materielEtape5, true);

        listeEtapesRecette.add(etape1);
        listeEtapesRecette.add(etape2);
        listeEtapesRecette.add(etape3);
        listeEtapesRecette.add(etape4);
        listeEtapesRecette.add(etape5);

        Recette recette = new Recette("Feuilleté de crabe", listeEtapesRecette, IngredientRecords, false, TypeRecette.ENTREE, 4);
    }

    public void oeufscocotte() throws InterruptedException{
        List<EtapeRecette> listeEtapesRecette = new ArrayList<>();
        List<IngredientRecord> IngredientRecords = new ArrayList<>();

        IngredientRecords.add(new IngredientRecord(new Ingredient("oeuf", TypeIngredient.AUTRE), 4, 15));
        IngredientRecords.add(new IngredientRecord(new Ingredient("gruyère", TypeIngredient.AUTRE), 1, 15));
        IngredientRecords.add(new IngredientRecord(new Ingredient("crème fraiche", TypeIngredient.AUTRE), 1, 15));

        EtapeRecette etape1 = new EtapeRecette("Séparer les blancs des jaunes et laisser ces derniers dans une demi-coquille", true, 30, 1, null, false);
        EtapeRecette etape2 = new EtapeRecette("Monter les blancs en neige et incorporer un sachet de râpé", false, 60, 2, null, false);
        EtapeRecette etape3 = new EtapeRecette("Mettre cette préparation dans un ramequin et faîtes un trou pour y loger un jaune d'oeuf", false, 60, 3, null, false );
        EtapeRecette etape4 = new EtapeRecette("Rajouter un peu de crème fraîche sur le jaune, poivrer et saler", true, 20, 4, null, false);

        List<Materiel> materielEtape5 = new ArrayList<>();
        materielEtape5.add(new Four());
        EtapeRecette etape5 = new EtapeRecette("Enfourner 5 minutes à four chaud", true, 300, 5, materielEtape5, true);

        listeEtapesRecette.add(etape1);
        listeEtapesRecette.add(etape2);
        listeEtapesRecette.add(etape3);
        listeEtapesRecette.add(etape4);
        listeEtapesRecette.add(etape5);

        Recette recette = new Recette("oeufs cocotte", listeEtapesRecette, IngredientRecords, false, TypeRecette.ENTREE, 4);
    }

    public void gaspacho() throws InterruptedException{
        List<EtapeRecette> listeEtapesRecette = new ArrayList<>();
        List<IngredientRecord> IngredientRecords = new ArrayList<>();

        IngredientRecords.add(new IngredientRecord(new Ingredient("tomate", TypeIngredient.LEGUME), 3, 30));
        IngredientRecords.add(new IngredientRecord(new Ingredient("oignon", TypeIngredient.LEGUME), 1, 60));
        IngredientRecords.add(new IngredientRecord(new Ingredient("concombre", TypeIngredient.LEGUME), 1, 30));
        IngredientRecords.add(new IngredientRecord(new Ingredient("pain rassi", TypeIngredient.AUTRE), 1, 60));
        IngredientRecords.add(new IngredientRecord(new Ingredient("huile d'olive", TypeIngredient.AUTRE), 1, 365));
        IngredientRecords.add(new IngredientRecord(new Ingredient("vinaigre", TypeIngredient.AUTRE), 1, 365));
        IngredientRecords.add(new IngredientRecord(new Ingredient("poivron", TypeIngredient.LEGUME), 1, 30));

        List<Materiel> materielEtape1 = new ArrayList<>();
        materielEtape1.add(new CouteauCuisine());
        EtapeRecette etape1 = new EtapeRecette("Au fond d'un saladier, mettre un crouton de pain rassi, rajouter l'huile d'olive, le vinaigre puis les lègumes coupés. Saler et poivrer.", true, 60, 1, materielEtape1, false);
        EtapeRecette etape2 = new EtapeRecette("Placer le récipient au frigo pour la nuit", true, 28800, 2, null, true);
        List<Materiel> materielEtape3 = new ArrayList<>();
        materielEtape3.add(new Tamis());
        EtapeRecette etape3 = new EtapeRecette("mixer et passer au tamis, Servir avec les mêmes lègumes coupés en petits morceaux sur du pain grillés à l'huile d'olive", true, 120, 3, materielEtape3, false);

        listeEtapesRecette.add(etape1);
        listeEtapesRecette.add(etape2);
        listeEtapesRecette.add(etape3);

        Recette recette = new Recette("gaspacho", listeEtapesRecette, IngredientRecords, true, TypeRecette.ENTREE, 1);


    }



}
