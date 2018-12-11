package com.gabz.projetcuisine;

import com.gabz.projetcuisine.view.CuisineView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.awt.*;

@SpringBootApplication
public class ProjetCuisineApplication extends JFrame implements CommandLineRunner {

    @Autowired
    private CocoCuisto cocoCuisto;

    public ProjetCuisineApplication() {
        initUI();
    }

    private void initUI() {

        add(new CuisineView());

        setSize(1000, 800);

        setTitle("Cuisine Simulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        SpringApplication.run(ProjetCuisineApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World");
/*
        cocoCuisto.feuilletecrabe();
        cocoCuisto.gaspacho();
        cocoCuisto.oeufscocotte();
        cocoCuisto.poulet();
*/
        EventQueue.invokeLater(() -> {
            ProjetCuisineApplication ex = new ProjetCuisineApplication();
            ex.setVisible(true);
        });
    }

}
