package com.gabz.projetcuisine;

import com.gabz.projetcuisine.view.CuisineView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.awt.*;
import java.net.ServerSocket;
import java.net.Socket;

@SpringBootApplication
public class ProjetCuisineApplication extends JFrame implements CommandLineRunner {

    @Autowired
    private CocoCuisto cocoCuisto;

    public static void main(String[] args) {
        SpringApplication.run(ProjetCuisineApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(8080, 1);
        Socket socket = serverSocket.accept();

        EventQueue.invokeLater(() -> {
            CuisineView ex = new CuisineView();
            ex.setVisible(true);
        });

        serverSocket.close();
        socket.close();
    }

}
