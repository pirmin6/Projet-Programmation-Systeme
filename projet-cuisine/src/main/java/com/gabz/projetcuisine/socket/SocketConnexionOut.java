package com.gabz.projetcuisine.socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketConnexionOut extends AbstractSocketConnexion {

    private PrintWriter out;

    public SocketConnexionOut(Socket socket, IEncodage encodage) throws IOException {
        super(socket, encodage);
        out = new PrintWriter(socket.getOutputStream());
    }
}
