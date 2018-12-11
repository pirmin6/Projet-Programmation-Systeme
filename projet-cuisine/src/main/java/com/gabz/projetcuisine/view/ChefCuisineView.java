package com.gabz.projetcuisine.view;

import javax.swing.*;
import java.awt.*;

public class ChefCuisineView extends JPanel {

    private Image bardejov;

    public ChefCuisineView() {

        initBoard();
    }

    private void initBoard() {

        loadImage();

        int w = bardejov.getWidth(this);
        int h = bardejov.getHeight(this);
        setPreferredSize(new Dimension(w, h));
    }

    private void loadImage() {

        ImageIcon ii = new ImageIcon("src/main/resources/commis.png");
        bardejov = ii.getImage();
    }

    @Override
    public void paintComponent(Graphics g) {

        g.drawImage(bardejov, 0, 0, null);
    }

}
