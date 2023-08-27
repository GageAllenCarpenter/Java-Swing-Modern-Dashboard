/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package io.github.gageallencarpenter.dashboard;

import io.github.gageallencarpenter.dashboard.view.MainFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author gagea
 */
public class Dashboard{

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->new MainFrame()); 
    }
}
