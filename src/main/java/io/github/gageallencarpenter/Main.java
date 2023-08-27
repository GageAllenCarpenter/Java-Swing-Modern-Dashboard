package io.github.gageallencarpenter;

import io.github.gageallencarpenter.view.frame.Application;

import javax.swing.*;

/**
 * The main class of the application.
 */
public class Main {


    /**
     * The main method of the application.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Application::getInstance);
    }
}

