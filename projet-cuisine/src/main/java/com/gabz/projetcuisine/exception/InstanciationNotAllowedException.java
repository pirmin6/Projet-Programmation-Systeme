package com.gabz.projetcuisine.exception;

public class InstanciationNotAllowedException extends Exception {

    InstanciationNotAllowedException() {
        super("Instanciation not allowed, check the nbr of allowed instances for this class");
    }
}
