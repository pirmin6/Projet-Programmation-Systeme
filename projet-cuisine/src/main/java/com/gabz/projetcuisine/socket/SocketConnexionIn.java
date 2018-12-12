package com.gabz.projetcuisine.socket;

import java.net.Socket;

public class SocketConnexionIn extends AbstractSocketConnexion implements Runnable {

    public SocketConnexionIn(Socket socket, IEncodage encodage) {
        super(socket, encodage);
    }

    @Override
    public void run() {

    }
}
