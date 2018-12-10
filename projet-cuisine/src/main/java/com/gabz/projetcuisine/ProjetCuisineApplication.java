package com.gabz.projetcuisine;

import com.gabz.projetcuisine.controller.common.CarteController;
import com.gabz.projetcuisine.model.common.repas.Carte;
import com.gabz.projetcuisine.model.cuisine.personnel.ChefCuisine;
import com.gabz.projetcuisine.view.CuisineView;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class ProjetCuisineApplication extends JFrame implements CommandLineRunner {

    private CarteController carteController = new CarteController();

    public static void main(String[] args) {
        SpringApplication.run(ProjetCuisineApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello World");
        initUI();
        }

    private void initUI() {
        add(new CuisineView());
        setSize(600, 500);
        setTitle("CuisineSimulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(new JLabel(new ImageIcon("")));
        setVisible(true);
    }

    public void simulerRestauratn() throws Exception {

        Carte carte = carteController.createCarte();
        ChefCuisine chefCuisine = ChefCuisine.getInstance(carte);
    }

}
