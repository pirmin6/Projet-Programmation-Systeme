package com.gabz.projetcuisine;

import com.gabz.projetcuisine.view.CuisineView;
import org.junit.Test;

import javax.swing.*;

public class TestCuisineView extends JFrame {

    @Test
    public void testView() {
        CuisineView cuisine = new CuisineView();

        initUI();

    }

    private void initUI() {
        add(new CuisineView());
        setSize(250, 200);
        setTitle("CuisineSimulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
