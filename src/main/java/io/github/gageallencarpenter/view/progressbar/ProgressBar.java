package io.github.gageallencarpenter.view.progressbar;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Gage
 */
public class ProgressBar extends JPanel {

    private JProgressBar progressBar = new JProgressBar();
    private Color panelBackground = new Color(0, 0, 0, 0);
    private Color barBackground = new Color(0, 0, 0, 0);
    private boolean paintBorder = false;
    LayoutManager layout = new BoxLayout(this, BoxLayout.Y_AXIS);
    private ModernProgressBarUI modernProgressBarUI = new ModernProgressBarUI();

    public ProgressBar() {
        setBackground(panelBackground);
        progressBar.setBorderPainted(paintBorder);
        progressBar.setBackground(barBackground);
        progressBar.setUI(modernProgressBarUI);
        setLayout(layout);
        add(progressBar);
    }

    public int getProgress(){
        return progressBar.getValue();
    }

    public void setProgress(double progress) {
        progressBar.setValue((int)progress);
    }

    /**
     * returns the progress bar.
     *
     * @return The progress bar.
     */
    public JProgressBar getProgressBar() {
        return progressBar;
    }

    /**
     * sets the progress bar to the progress bar that is passed in.
     *
     * @param progressBar The progress bar to update.
     */
    public void setProgressBar(JProgressBar progressBar) {
        this.progressBar = progressBar;
    }

    /**
     * returns the panelBackground variable.
     *
     * @return The panelBackground variable.
     */
    public Color getPanelBackground() {
        return panelBackground;
    }

    /**
     * sets the panelBackground variable to the value of the parameter panelBackground.
     *
     * @param panelBackground The background color of the panel.
     */
    public void setPanelBackground(Color panelBackground) {
        this.panelBackground = panelBackground;
    }

    /**
     * returns the background color of the bar.
     *
     * @return The barBackground variable.
     */
    public Color getBarBackground() {
        return barBackground;
    }


    /**
     * Sets the background color of the bar.
     *
     * @param barBackground The background color of the bar.
     */
    public void setBarBackground(Color barBackground) {
        this.barBackground = barBackground;
    }

    /**
     * Returns whether the border is painted
     *
     * @return The value of the paintBorder variable.
     */
    public boolean isPaintBorder() {
        return paintBorder;
    }


    /**
     * sets the paintBorder variable to the value of the parameter paintBorder.
     *
     * @param paintBorder If true, the border is painted.
     */
    public void setPaintBorder(boolean paintBorder) {
        this.paintBorder = paintBorder;
    }

    /**
     * Returns the layout manager for this container.
     *
     * @return The layout of the panel.
     */
    public LayoutManager getLayoutManager() {
        return layout;
    }

    /**
     * sets the layout of the panel to the layout that is passed in.
     *
     * @param layout The layout manager to use.
     */
    public void setLayoutManager(LayoutManager layout) {
        this.layout = layout;
    }

    /**
     * returns the fancyProgressBar object.
     *
     * @return The FancyProgressBar object.
     */
    public ModernProgressBarUI getModernProgressBarUI() {
        return modernProgressBarUI;
    }

    /**
     * sets the fancyProgressBar variable to the fancyProgressBar variable that was passed in.
     *
     * @param modernProgressBarUI The FancyProgressBar object to use.
     */
    public void setModernProgressBarUI(ModernProgressBarUI modernProgressBarUI) {
        this.modernProgressBarUI = modernProgressBarUI;
    }
}