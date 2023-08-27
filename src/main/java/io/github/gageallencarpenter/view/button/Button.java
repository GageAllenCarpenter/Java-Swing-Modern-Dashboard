package io.github.gageallencarpenter.view.button;

import io.github.gageallencarpenter.view.paint.ICustomPaint;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class Button extends JButton implements ICustomPaint {

    private String text = "";
    private Color color1 = new Color(52, 52, 52);
    private Color color2 = new Color(52, 52, 52);
    private int  arcWidth = 40;
    private int arcHeight = 40;

    public Button(){
        setBorderPainted(false);
        setContentAreaFilled(false);
        setForeground(Color.white);
        setFocusPainted(false);
    }

    /**
     * Set the text of the button.
     */
    public void setText(String text){
        this.text = text;
    }

    /**
     * get the text of the button.
     */
    public String getText() {
        return text;
    }

    /**
     * Paint the button.
     * @param graphics the <code>Graphics</code> object to protect
     */
    @Override
    protected void paintComponent(Graphics graphics) {
        ICustomPaint.roundedPanel(graphics, color1, color2, arcWidth, arcHeight, getWidth(), getHeight());
        super.paintComponent(graphics);
    }

    /**
     * Get the color1 of the button.
     *
     * @return The color1 of the button.
     */
    @Override
    public Color getColor1() {
        return color1;
    }

    /**
     * Set the color1 of the button.
     *
     * @param color1 The color1 of the button.
     */
    @Override
    public void setColor1(Color color1) {
        this.color1 = color1;
        setBorderPainted(false);
        setContentAreaFilled(false);
        setForeground(Color.white);
        setFocusPainted(false);
    }

    /**
     * Get the color2 of the button.
     *
     * @return The color2 of the button.
     */
    @Override
    public Color getColor2() {
        return color2;
    }

    /**
     * Set the color2 of the button.
     *
     * @param color2 The color2 of the button.
     */
    @Override
    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    /**
     * Get the arcWidth of the button.
     *
     * @return The arcWidth of the button.
     */
    @Override
    public int getArcWidth() {
        return arcWidth;
    }

    /**
     * Set the arcWidth of the button.
     *
     * @param arcWidth The arcWidth of the button.
     */
    @Override
    public void setArcWidth(int arcWidth) {
        this.arcWidth = arcWidth;
    }

    /**
     * Get the arcHeight of the button.
     *
     * @return The arcHeight of the button.
     */
    @Override
    public int getArcHeight() {
        return arcHeight;
    }

    /**
     * Set the arcHeight of the button.
     *
     * @param arcHeight The arcHeight of the button.
     */
    @Override
    public void setArcHeight(int arcHeight) {
        this.arcHeight = arcHeight;
    }
}

