
package io.github.gageallencarpenter.view.panel.dashboard;

import io.github.gageallencarpenter.view.label.ServiceCompletionLabel;
import io.github.gageallencarpenter.view.paint.ICustomPaint;
import io.github.gageallencarpenter.view.progressbar.ProgressBar;

import java.awt.*;

/**
 * A sub panel of the service allocator that shows a progress bar. The progress bar is used to
 * display the progress of a given group of services
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class ProgressPanel extends javax.swing.JPanel implements ICustomPaint {

    private Color color1 = Color.BLACK;
    private Color color2 = Color.WHITE;
    private int arcWidth = 40;
    private int arcHeight = 40;

    /**
     * Create a new ProgressPanel.
     */
    public ProgressPanel() {
        initComponents();
        setOpaque(false);
        setBackground(new Color(0,0,0));
    }

    /**
     * Get the first color of the gradient.
     *
     * @return The first color of the gradient.
     */
    @Override
    public Color getColor1() {
        return color1;
    }

    /**
     * Set the first color of the gradient.
     *
     * @param color1 The new first color of the gradient.
     */
    @Override
    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    /**
     * Get the second color of the gradient.
     *
     * @return The second color of the gradient.
     */
    @Override
    public Color getColor2() {
        return color2;
    }

    /**
     * Set the second color of the gradient.
     *
     * @param color2 The new second color of the gradient.
     */
    @Override
    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    /**
     * Get the width of the arc.
     *
     * @return The width of the arc.
     */
    @Override
    public int getArcWidth() {
        return arcWidth;
    }

    /**
     * Set the width of the arc.
     *
     * @param arcWidth The new width of the arc.
     */
    @Override
    public void setArcWidth(int arcWidth) {
        this.arcWidth = arcWidth;
    }

    /**
     * Get the height of the arc.
     *
     * @return The height of the arc.
     */
    @Override
    public int getArcHeight() {
        return arcHeight;
    }

    /**
     * Set the height of the arc.
     *
     * @param arcHeight The new height of the arc.
     */
    @Override
    public void setArcHeight(int arcHeight) {
        this.arcHeight = arcHeight;
    }

    public ServiceCompletionLabel getServiceLabel(){
        return serviceCompletionLabel;
    }
    
    public ProgressBar getServiceProgressBar(){
       return progressBar;
    }

    @SuppressWarnings("All")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        serviceCompletionLabel = new io.github.gageallencarpenter.view.label.ServiceCompletionLabel();
        progressBar = new io.github.gageallencarpenter.view.progressbar.ProgressBar();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(serviceCompletionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(serviceCompletionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Paint the component.
     *
     * @param graphics  the <code>Graphics</code> context in which to paint
     */
    @Override
    protected void paintChildren(Graphics graphics) {
        ICustomPaint.roundedHorizontalPanel(graphics,getColor1(),getColor2(),getArcWidth(),getArcHeight(),getWidth(),getHeight());
        super.paintChildren(graphics);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private io.github.gageallencarpenter.view.progressbar.ProgressBar progressBar;
    private io.github.gageallencarpenter.view.label.ServiceCompletionLabel serviceCompletionLabel;
    // End of variables declaration//GEN-END:variables
}
