package com.gabz.projetcuisine.socket;

public interface IEncodage {

    Object fromObjectToJson(Object o);
    Object fromJsonToBytes(Object o);
}
