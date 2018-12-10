package com.gabz.projetcuisine.controller.common;

import com.gabz.projetcuisine.model.common.repas.Carte;
import com.gabz.projetcuisine.model.common.repas.Plat;
import com.gabz.projetcuisine.model.common.repas.Vin;
import com.gabz.projetcuisine.repository.CarteRepository;
import com.gabz.projetcuisine.repository.PlatRepository;
import com.gabz.projetcuisine.repository.VinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Controller
public class CarteController {

    @Autowired
    private VinRepository vinRepository;

    @Autowired
    private PlatRepository platRepository;

    public Carte createCarte() throws Exception {

        //generate random menu
        Random generator = new Random();
        int choixMenu = generator.nextInt(11);

        Optional<Plat> platduJour = platRepository.findById(choixMenu);
        if (!platduJour.isPresent()) {
            throw new Exception();
        }

        List<Vin> vins = vinRepository.findAll();
        return new Carte(new Date(), vins, platduJour.get());
    }
}
