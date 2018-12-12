package com.gabz.projetcuisine.socket;

import java.net.Socket;

public abstract class AbstractSocketConnexion {

    private Socket socket;
    private IEncodage encodage;

    public AbstractSocketConnexion(Socket socket, IEncodage encodage) {
        this.socket = socket;
        this.encodage = encodage;
    }

    public void encode() {

        //encodage.encode();
    }

    public Object decode() {

        //encodage.decode()
        return new Object();
    }
}
