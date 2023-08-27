package io.github.gageallencarpenter.view.button;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTargetAdapter;

/**
 * A custom button for JFrames. This button is used to close a JFrame.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class ToolBarButton extends JButton {

    private final Animator animator;
    private boolean mouseOver;
    private float animate;
    private Color hoverColor = new Color(100, 100, 100);

    /**
     * Create a new ToolBarButton.
     */
    public ToolBarButton() {
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setBackground(new Color(50, 50, 50));
        setBorder(new EmptyBorder(0, 0, 0, 0));
        setContentAreaFilled(false);
        setFocusable(false);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                mouseOver = true;
                stopAnimation();
                animator.start();
            }

            @Override
            public void mouseExited(MouseEvent me) {
                mouseOver = false;
                stopAnimation();
                animator.start();
            }
        });
        animator = new Animator(300, new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                fraction *= 0.8f;
                if (mouseOver) {
                    animate = fraction;
                } else {
                    animate = 0.8f - fraction;
                }
                repaint();
            }
        });
        animator.setResolution(0);
    }

    /**
     * Create a new ToolBarButton.
     */
    public Color getHoverColor() {
        return hoverColor;
    }

    /**
     * Set the hover color of the button.
     *
     * @param hoverColor The hover color of the button.
     */
    public void setHoverColor(Color hoverColor) {
        this.hoverColor = hoverColor;
    }


    /**
     * If the animation is running, stop it and set the start fraction to the inverse of the current timing fraction. If
     * the animation is not running, set the start fraction to 0
     */
    private void stopAnimation() {
        if (animator.isRunning()) {
            float f = animator.getTimingFraction();
            animator.stop();
            animator.setStartFraction(1f - f);
        } else {
            animator.setStartFraction(0f);
        }
    }

    /**
     * Paint the button.
     *
     * @param graphics the <code>Graphics</code> object to protect
     */
    @Override
    protected void paintComponent(Graphics graphics) {
        Graphics2D g2 = (Graphics2D) graphics.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int width = getWidth();
        int height = getHeight();
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, animate));
        g2.setColor(hoverColor);
        g2.fillRect(0, 0, width, height);
        g2.dispose();
        super.paintComponent(graphics);
    }
}
