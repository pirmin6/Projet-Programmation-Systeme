package com.gabz.projetcuisine.view;

import javax.swing.*;
import java.awt.*;

public class CuisineView extends JFrame {

    public CuisineView() {
        initUI();
    }

    private void initUI() {

        add(new ChefPartieView(100,100));
        add(new ChefPartieView(300,300));
        add(new ChefPartieView(100,100));

        setSize(1000, 800);

        setTitle("Cuisine Simulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }
}
