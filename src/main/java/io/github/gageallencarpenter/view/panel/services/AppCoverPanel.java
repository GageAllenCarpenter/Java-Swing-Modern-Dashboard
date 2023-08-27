
package io.github.gageallencarpenter.view.panel.services;

/**
 * A custom panel for displaying the application cover. Application Cover is used to display
 * an app store image when long loading times occur and there are no other components to display.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class AppCoverPanel extends javax.swing.JPanel { //TODO: Add a Notification Method in AppTable When JTable.Size == 0 Dependent on the Search Query;

    private static AppCoverPanel instance;

    /**
     * Create a new AppCoverPanel.
     */
    private AppCoverPanel() {
        initComponents();
    }

    /**
     * Get the instance of the AppCoverPanel.
     *
     * @return The instance of the AppCoverPanel.
     */
    public static AppCoverPanel getInstance(){
        if(instance == null){
            instance = new AppCoverPanel();
        }
        return instance;
    }

    @SuppressWarnings("All")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoLabel = new javax.swing.JLabel();

        setForeground(new java.awt.Color(255, 255, 255));
        setOpaque(false);

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/AppLogo.jpg"))); // NOI18N
        add(logoLabel);
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("All")
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel logoLabel;
    // End of variables declaration//GEN-END:variables
}
