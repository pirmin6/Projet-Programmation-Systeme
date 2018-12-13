package com.gabz.projetcuisine.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class SocketConnexionIn extends AbstractSocketConnexion implements Runnable {

    private BufferedReader in;

    public SocketConnexionIn(Socket socket, IEncodage encodage) throws IOException {
        super(socket, encodage);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }

    @Override
    public void run() {

        while (true) {
        }
    }
}
