package com.gabz.projetcuisine.socket;

import java.net.Socket;

public class SocketConnexionOut extends AbstractSocketConnexion implements Runnable {

    public SocketConnexionOut(Socket socket, IEncodage encodage) {
        super(socket, encodage);
    }

    @Override
    public void run() {

    }
}
