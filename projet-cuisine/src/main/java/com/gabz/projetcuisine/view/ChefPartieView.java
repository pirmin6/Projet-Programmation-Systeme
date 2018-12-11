package com.gabz.projetcuisine.view;

import javax.swing.*;
import java.awt.*;

public class ChefPartieView extends JPanel {

    private int posX;
    private int posY;
    private Image bardejov;

    public ChefPartieView(int x, int y) {

        this.posX = x;
        this.posY = y;
        initBoard();
    }



    private void initBoard() {

        loadImage();

        int w = bardejov.getWidth(this);
        int h =  bardejov.getHeight(this);
        setPreferredSize(new Dimension(w, h));
    }

    private void loadImage() {

        ImageIcon ii = new ImageIcon("src/main/resources/commis.png");
        bardejov = ii.getImage();
    }

    @Override
    public void paintComponent(Graphics g) {

        g.drawImage(bardejov, posX, posY, null);
    }
}
