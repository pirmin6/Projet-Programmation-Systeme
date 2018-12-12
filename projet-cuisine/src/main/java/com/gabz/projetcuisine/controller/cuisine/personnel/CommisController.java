package com.gabz.projetcuisine.controller.cuisine.personnel;

import com.gabz.projetcuisine.model.cuisine.repas.IngredientRecord;
import com.gabz.projetcuisine.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommisController {

    @Autowired
    private StockRepository stockRepository;

    public void amenerPlatComptoir() {

    }
}
