package com.gabz.projetcuisine;

import com.gabz.projetcuisine.model.common.vaisselle.couvert.Couteau;
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
        List<String> materielEtape1 = new ArrayList<>();

        // ENSUITE ON CREE LETAPE
        materielEtape1.add(CouteauCuisine.class.toString());
        EtapeRecette etape1 = new EtapeRecette("Couper le poulet en lamelles", true, 60, 1,
                materielEtape1, false);

        // Etape 2 ON FAIT PAREIL
        List<String> materielEtape2 = new ArrayList<>();
        materielEtape2.add(Poele.class.toString());
        EtapeRecette etape2 = new EtapeRecette("Cuire le poulet à la poele", false, 240, 2, materielEtape2, true);

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


        List<String> materielEtape1 = new ArrayList<>();
        materielEtape1.add(BolSalade.class.toString());
        EtapeRecette etape1 = new EtapeRecette("Mélanger la chair de crabe, le jus de citron, la chapelure, les herbes et le piment\n" +
                "Lier le tout avec un œuf", false, 60, 1, materielEtape1, false);

        List<String> materielEtape2 = new ArrayList<>();
        materielEtape2.add(CouteauCuisine.class.toString());
        EtapeRecette etape2 = new EtapeRecette("Découper 4 disques dans la pâte feuilletée et répartir la farce sur la moitié de chaque disque, en laissant 1 cm de rebord", false, 60, 2, materielEtape2, false);

        EtapeRecette etape3 = new EtapeRecette("Rabattre l'autre moitié et souder", false, 60, 3, null, false);

        EtapeRecette etape4 = new EtapeRecette("Badigeonner les feuilletés avec un oeuf battu et salé, puis strier avec une fourchette", true, 60, 4, null, false);


        List<String> materielEtape5 = new ArrayList<>();
        materielEtape5.add(Four.class.toString());
        EtapeRecette etape5 = new EtapeRecette("Mettre au four à 180° (th 6) pendant 20mn minimum", true, 1200, 5, materielEtape5, true);

        listeEtapesRecette.add(etape1);
        listeEtapesRecette.add(etape2);
        listeEtapesRecette.add(etape3);
        listeEtapesRecette.add(etape4);
        listeEtapesRecette.add(etape5);

        Recette recette = new Recette("Feuilleté de crabe", listeEtapesRecette, IngredientRecords, false, TypeRecette.ENTREE);
        recetteRepository.save(recette);
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

        List<String> materielEtape5 = new ArrayList<>();
        materielEtape5.add(Four.class.toString());
        EtapeRecette etape5 = new EtapeRecette("Enfourner 5 minutes à four chaud", true, 300, 5, materielEtape5, true);

        listeEtapesRecette.add(etape1);
        listeEtapesRecette.add(etape2);
        listeEtapesRecette.add(etape3);
        listeEtapesRecette.add(etape4);
        listeEtapesRecette.add(etape5);

        Recette recette = new Recette("oeufs cocotte", listeEtapesRecette, IngredientRecords, false, TypeRecette.ENTREE);
        recetteRepository.save(recette);
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

        List<String> materielEtape1 = new ArrayList<>();
        materielEtape1.add(CouteauCuisine.class.toString());
        EtapeRecette etape1 = new EtapeRecette("Au fond d'un saladier, mettre un crouton de pain rassi, rajouter l'huile d'olive, le vinaigre puis les lègumes coupés. Saler et poivrer.", true, 60, 1, materielEtape1, false);
        EtapeRecette etape2 = new EtapeRecette("Placer le récipient au frigo pour la nuit", true, 28800, 2, null, true);
        List<String> materielEtape3 = new ArrayList<>();
        materielEtape3.add(Tamis.class.toString());
        EtapeRecette etape3 = new EtapeRecette("mixer et passer au tamis, Servir avec les mêmes lègumes coupés en petits morceaux sur du pain grillés à l'huile d'olive", true, 120, 3, materielEtape3, false);

        listeEtapesRecette.add(etape1);
        listeEtapesRecette.add(etape2);
        listeEtapesRecette.add(etape3);

        Recette recette = new Recette("gaspacho", listeEtapesRecette, IngredientRecords, true, TypeRecette.ENTREE);

        recetteRepository.save(recette);
    }

    public void patedesanglier() throws InterruptedException {

        List<EtapeRecette> listeEtapesRecette = new ArrayList<>();
        List<IngredientRecord> IngredientRecords = new ArrayList<>();

        IngredientRecords.add(new IngredientRecord(new Ingredient("ventreche", TypeIngredient.VIANDE), 1, 10));
        IngredientRecords.add(new IngredientRecord(new Ingredient("sanglier", TypeIngredient.VIANDE), 1, 10));
        IngredientRecords.add(new IngredientRecord(new Ingredient("chaire à saucisse", TypeIngredient.VIANDE), 1, 10));
        IngredientRecords.add(new IngredientRecord(new Ingredient("gorge de porc", TypeIngredient.VIANDE), 1, 10));
        IngredientRecords.add(new IngredientRecord(new Ingredient("truffe", TypeIngredient.AUTRE),1, 30));

        List<String> materielEtape1 = new ArrayList<>();
        materielEtape1.add(CouteauCuisine.class.toString());
        EtapeRecette etape1 = new EtapeRecette("Hacher les viandes puis bien mélanger le tout. Parfumer (truffes, herbes etc….) puis remplir les bocaux en tassant un peu", false, 300, 1, materielEtape1, false);
        EtapeRecette etape2 = new EtapeRecette("Faire cuire les bocaux au four au bain marie pendant 2 heures puis les retirer immédiatement, les fermer", true, 7200, 2, null, true);
        EtapeRecette etape3 = new EtapeRecette("les placer dans un couscoussier rempli d’eau chaude avec un torchon au fond puis des pierres dessus et faire cuire encore 1 heure ½. Les laisser dans le couscoussier jusqu’à refroidissement total", true, 7200, 3, null, true);

        listeEtapesRecette.add(etape1);
        listeEtapesRecette.add(etape2);
        listeEtapesRecette.add(etape3);

        Recette recette = new Recette("pâté de sanglier", listeEtapesRecette, IngredientRecords, true, TypeRecette.ENTREE);

        recetteRepository.save(recette);

    }

    public void tartethon() throws InterruptedException {

        List<EtapeRecette> listeEtapesRecette = new ArrayList<>();
        List<IngredientRecord> IngredientRecords = new ArrayList<>();

        IngredientRecords.add(new IngredientRecord(new Ingredient("farine", TypeIngredient.AUTRE), 1, 365));
        IngredientRecords.add(new IngredientRecord(new Ingredient("lait", TypeIngredient.AUTRE), 1, 20));
    }


}