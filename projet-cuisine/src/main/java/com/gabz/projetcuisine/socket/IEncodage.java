package com.gabz.projetcuisine.socket;

public interface IEncodage {

    byte[] encode(Object object);
    Object decode(byte[] bytes);
}
