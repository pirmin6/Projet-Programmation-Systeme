package com.gabz.projetcuisine;

import com.gabz.projetcuisine.repository.RecetteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CocoCuisto {

    @Autowired
    private RecetteRepository recetteRepository;

}
