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

    public static Recette poulet() throws InterruptedException {

        List<EtapeRecette> listeEtapesRecette = new ArrayList<>();

        //ON CREEE LA LISTE DES INGREDIENTS POUR LA RECETTE ESPECE DE GROS DEBILE
        List<IngredientRecordEtapeRecette> ingredientRecordEtapeRecettes = new ArrayList<>();

        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("Poulet", TypeIngredient.VIANDE),1));
        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("huile OLIVE", TypeIngredient.AUTRE), 1));

        //Etape 1
        //DABORD LE MATERIEL
        List<String> materielEtape1 = new ArrayList<>();

        // ENSUITE ON CREE LETAPE
        materielEtape1.add(CouteauCuisine.class.getName());
        EtapeRecette etape1 = new EtapeRecette("Couper le poulet en lamelles", true, 6000, 1,
                materielEtape1, false);

        // Etape 2 ON FAIT PAREIL
        List<String> materielEtape2 = new ArrayList<>();
        materielEtape2.add(Poele.class.getName());
        EtapeRecette etape2 = new EtapeRecette("Cuire le poulet à la poele", false, 24000, 2, materielEtape2, true);

        // JAJOUTE LES ETAPES CREEE A LA LISTE GROS LOURDEAU
        listeEtapesRecette.add(etape1);
        listeEtapesRecette.add(etape2);

        // GNEUFDSFDSFS ET ENSUITE ON CREEE LA RECETTE
        Recette recette = new Recette("Poulet à la poele", listeEtapesRecette, ingredientRecordEtapeRecettes, false, TypeRecette.PLAT);

        // HOHOHO ON SAUVEGARDE LA RECETTE
//        recetteRepository.save(recette);
        return recette;
    }

    public static Recette feuilletecrabe() throws InterruptedException {

        List<EtapeRecette> listeEtapesRecette = new ArrayList<>();

        List<IngredientRecordEtapeRecette> ingredientRecordEtapeRecettes = new ArrayList<>();

        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("crabe", TypeIngredient.AUTRE), 1));
        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("piment", TypeIngredient.LEGUME), 1));
        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("persil", TypeIngredient.AUTRE), 1));
        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("oeufs", TypeIngredient.AUTRE), 2));
        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("pate feuilleté", TypeIngredient.AUTRE), 4));
        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("huile", TypeIngredient.AUTRE), 1));
        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("oignons", TypeIngredient.LEGUME), 1));
        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("citron", TypeIngredient.FRUIT), 1));
        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("crème fraiche", TypeIngredient.AUTRE), 1));


        List<String> materielEtape1 = new ArrayList<>();
        materielEtape1.add(BolSalade.class.getName());
        EtapeRecette etape1 = new EtapeRecette("Mélanger la chair de crabe, le jus de citron, la chapelure, les herbes et le piment\n" +
                "Lier le tout avec un œuf", false, 60, 1, materielEtape1, false);

        List<String> materielEtape2 = new ArrayList<>();
        materielEtape2.add(CouteauCuisine.class.getName());
        EtapeRecette etape2 = new EtapeRecette("Découper 4 disques dans la pâte feuilletée et répartir la farce sur la moitié de chaque disque, en laissant 1 cm de rebord", false, 60000, 2, materielEtape2, false);

        EtapeRecette etape3 = new EtapeRecette("Rabattre l'autre moitié et souder", false, 6000, 3, new ArrayList<>(), false);

        EtapeRecette etape4 = new EtapeRecette("Badigeonner les feuilletés avec un oeuf battu et salé, puis strier avec une fourchette", true, 60000, 4, new ArrayList<>(), false);


        List<String> materielEtape5 = new ArrayList<>();
        materielEtape5.add(Four.class.getName());
        EtapeRecette etape5 = new EtapeRecette("Mettre au four à 180° (th 6) pendant 20mn minimum", true, 12000, 5, materielEtape5, true);

        listeEtapesRecette.add(etape1);
        listeEtapesRecette.add(etape2);
        listeEtapesRecette.add(etape3);
        listeEtapesRecette.add(etape4);
        listeEtapesRecette.add(etape5);

        Recette recette = new Recette("Feuilleté de crabe", listeEtapesRecette, ingredientRecordEtapeRecettes, false, TypeRecette.ENTREE);
        //recetteRepository.save(recette);
        return recette;
    }

    public static Recette oeufscocotte() throws InterruptedException{
        List<EtapeRecette> listeEtapesRecette = new ArrayList<>();
        List<IngredientRecordEtapeRecette> ingredientRecordEtapeRecettes = new ArrayList<>();

        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("oeuf", TypeIngredient.AUTRE), 4));
        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("gruyère", TypeIngredient.AUTRE), 1));
        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("crème fraiche", TypeIngredient.AUTRE), 1));

        EtapeRecette etape1 = new EtapeRecette("Séparer les blancs des jaunes et laisser ces derniers dans une demi-coquille", true, 3000, 1, new ArrayList<>(), false);
        EtapeRecette etape2 = new EtapeRecette("Monter les blancs en neige et incorporer un sachet de râpé", false, 6000, 2, new ArrayList<>(), false);
        EtapeRecette etape3 = new EtapeRecette("Mettre cette préparation dans un ramequin et faîtes un trou pour y loger un jaune d'oeuf", false, 6000, 3, new ArrayList<>(), false );
        EtapeRecette etape4 = new EtapeRecette("Rajouter un peu de crème fraîche sur le jaune, poivrer et saler", true, 2000, 4, new ArrayList<>(), false);

        List<String> materielEtape5 = new ArrayList<>();
        materielEtape5.add(Four.class.getName());
        EtapeRecette etape5 = new EtapeRecette("Enfourner 5 minutes à four chaud", true, 300, 5, materielEtape5, true);

        listeEtapesRecette.add(etape1);
        listeEtapesRecette.add(etape2);
        listeEtapesRecette.add(etape3);
        listeEtapesRecette.add(etape4);
        listeEtapesRecette.add(etape5);

        Recette recette = new Recette("oeufs cocotte", listeEtapesRecette, ingredientRecordEtapeRecettes, false, TypeRecette.ENTREE);
        //recetteRepository.save(recette);
        return recette;
    }

    public static Recette gaspacho() throws InterruptedException{
        List<EtapeRecette> listeEtapesRecette = new ArrayList<>();
        List<IngredientRecordEtapeRecette> ingredientRecordEtapeRecettes = new ArrayList<>();

        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("tomate", TypeIngredient.LEGUME), 3));
        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("oignon", TypeIngredient.LEGUME), 1));
        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("concombre", TypeIngredient.LEGUME), 1));
        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("pain rassi", TypeIngredient.AUTRE), 1));
        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("huile d'olive", TypeIngredient.AUTRE), 1));
        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("vinaigre", TypeIngredient.AUTRE), 1));
        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("poivron", TypeIngredient.LEGUME), 1));

        List<String> materielEtape1 = new ArrayList<>();
        materielEtape1.add(CouteauCuisine.class.getName());
        EtapeRecette etape1 = new EtapeRecette("Au fond d'un saladier, mettre un crouton de pain rassi, rajouter l'huile d'olive, le vinaigre puis les lègumes coupés. Saler et poivrer.", true, 60000, 1, materielEtape1, false);
        EtapeRecette etape2 = new EtapeRecette("Placer le récipient au frigo pour la nuit", true, 28800, 2, new ArrayList<>(), true);
        List<String> materielEtape3 = new ArrayList<>();
        materielEtape3.add(Tamis.class.getName());
        EtapeRecette etape3 = new EtapeRecette("mixer et passer au tamis, Servir avec les mêmes lègumes coupés en petits morceaux sur du pain grillés à l'huile d'olive", true, 120000, 3, materielEtape3, false);

        listeEtapesRecette.add(etape1);
        listeEtapesRecette.add(etape2);
        listeEtapesRecette.add(etape3);

        Recette recette = new Recette("gaspacho", listeEtapesRecette, ingredientRecordEtapeRecettes, true, TypeRecette.ENTREE);

        //recetteRepository.save(recette);
        return recette;
    }

    public static Recette patedesanglier() throws InterruptedException {

        List<EtapeRecette> listeEtapesRecette = new ArrayList<>();
        List<IngredientRecordEtapeRecette> ingredientRecordEtapeRecettes = new ArrayList<>();

        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("ventreche", TypeIngredient.VIANDE), 1));
        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("sanglier", TypeIngredient.VIANDE), 1));
        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("chaire à saucisse", TypeIngredient.VIANDE), 1));
        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("gorge de porc", TypeIngredient.VIANDE), 1));
        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("truffe", TypeIngredient.AUTRE),1));

        List<String> materielEtape1 = new ArrayList<>();
        materielEtape1.add(CouteauCuisine.class.getName());
        EtapeRecette etape1 = new EtapeRecette("Hacher les viandes puis bien mélanger le tout. Parfumer (truffes, herbes etc….) puis remplir les bocaux en tassant un peu", false, 30000, 1, materielEtape1, false);
        EtapeRecette etape2 = new EtapeRecette("Faire cuire les bocaux au four au bain marie pendant 2 heures puis les retirer immédiatement, les fermer", true, 720000, 2, new ArrayList<>(), true);
        EtapeRecette etape3 = new EtapeRecette("les placer dans un couscoussier rempli d’eau chaude avec un torchon au fond puis des pierres dessus et faire cuire encore 1 heure ½. Les laisser dans le couscoussier jusqu’à refroidissement total", true, 720000, 3, new ArrayList<>(), true);

        listeEtapesRecette.add(etape1);
        listeEtapesRecette.add(etape2);
        listeEtapesRecette.add(etape3);

        Recette recette = new Recette("pâté de sanglier", listeEtapesRecette, ingredientRecordEtapeRecettes, true, TypeRecette.ENTREE);

        //recetteRepository.save(recette);
        return recette;

    }

    public static Recette tartethon() throws InterruptedException {

        List<EtapeRecette> listeEtapesRecette = new ArrayList<>();
        List<IngredientRecordEtapeRecette> ingredientRecordEtapeRecettes = new ArrayList<>();

        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("farine", TypeIngredient.AUTRE), 1));
        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("lait", TypeIngredient.AUTRE), 1));
        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("champignon", TypeIngredient.LEGUME), 1));
        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("thon", TypeIngredient.POISSON), 1));
        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("gruyère", TypeIngredient.AUTRE), 1));
        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("pate feuilleté", TypeIngredient.AUTRE), 1));
        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("beurre", TypeIngredient.AUTRE), 1));

        EtapeRecette etape1 = new EtapeRecette("Etaler la pate dans un moule, Faire fondre le beurre, y ajouter la farine et le lait petit à petit, Bien mélanger à l'aide d'un fouet jusqu’à épaississement, saler et poivrer. Egoutter le thon et les champignons puis les ajouter à la béchamelle, Mettre l'appareil sur la pate et parsemer de gruyère", false, 600, 1, new ArrayList<>(), false);
        List<String> materielEtape2 = new ArrayList<>();
        materielEtape2.add(Four.class.getName());
        EtapeRecette etape2 = new EtapeRecette("mettre au four 20min", true, 120000, 2, materielEtape2, true);


        listeEtapesRecette.add(etape1);
        listeEtapesRecette.add(etape1);

        Recette recette = new Recette("tarte au thon", listeEtapesRecette, ingredientRecordEtapeRecettes, false, TypeRecette.ENTREE);
        //recetteRepository.save(recette);
        return recette;

    }

    public static Recette quichelorraineaupoulet() throws InterruptedException {

        List<EtapeRecette> listeEtapesRecette = new ArrayList<>();
        List<IngredientRecordEtapeRecette> ingredientRecordEtapeRecettes = new ArrayList<>();

        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("pate feuilleté", TypeIngredient.AUTRE), 1));
        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("oeuf", TypeIngredient.AUTRE), 3));
        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("creme fraiche", TypeIngredient.AUTRE), 1));
        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("lait", TypeIngredient.AUTRE), 1));
        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("poulet", TypeIngredient.VIANDE), 1));
        ingredientRecordEtapeRecettes.add(new IngredientRecordEtapeRecette(new Ingredient("gruyere", TypeIngredient.AUTRE), 1));

        EtapeRecette etape1 = new EtapeRecette("Mettez la pâte dans le moule dans le four chaud pendant 10 min le temps que la pâte dore très légèrement.\n" +
                "Sortez la pâte et laissez la reposer pendant que vous préparez l’appareil.", true, 180000, 1, new ArrayList<>(), true);
        EtapeRecette etape2 = new EtapeRecette("Durant la pré-cuisson de la pâte, prenez les lardons et faites les cuire à la poêle à feu vif, durant la cuisson égouttez les avec une passoire afin de faire partir leur graisse ayant fondu, le but étant de les griller légèrement pour leur donner davantage de saveur.", false, 60000, 2, new ArrayList<>(), false);

        List<String> materielEtape3 = new ArrayList<>();
        materielEtape3.add(BolSalade.class.getName());
        EtapeRecette etape3 = new EtapeRecette("Prenez le saladier et cassez-y les 3 œufs puis versez la crème fraîche.\n" +
                "Mélangez les œufs et la crème fraiche avec le fouet.\n" +
                "Rajoutez progressivement le lait tout en continuant à mélanger avec le fouet\n" +
                "Ajoutez le Sel et le poivre\n" +
                "Puis la Muscade\n" +
                "Etalez les morceaux de poulet sur la pâte précuite de manière harmonieuse et régulière.\n" +
                "Versez dessus l’appareil à Quiche Lorraine\n" +
                "Saupoudrez de manière régulière la Quiche Lorraine avec l’emmental.\n", false, 6000, 2, materielEtape3, false);
        List<String> materielEtape4 = new ArrayList<>();
        materielEtape4.add(Four.class.getName());
        EtapeRecette etape4 = new EtapeRecette("Enfournez la Quiche Lorraine durant 30 minutes à 250°C", false, 240000, 4, materielEtape4, true);

        Recette recette = new Recette("quichelorrainepoulet", listeEtapesRecette, ingredientRecordEtapeRecettes, false, TypeRecette.ENTREE);
        //recetteRepository.save(recette);
        return recette;
    }

}
