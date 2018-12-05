package com.gabz.projetcuisine.model.common.vaisselle.assiette;

import java.util.concurrent.Semaphore;

public class AssietteCreuse extends Assiette {

    private static Semaphore nbrInstance = new Semaphore(30);
}
