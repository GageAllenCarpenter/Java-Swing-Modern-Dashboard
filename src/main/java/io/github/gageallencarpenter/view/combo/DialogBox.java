package io.github.gageallencarpenter.view.combo;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicComboBoxUI;
import java.awt.*;

public class DialogBox<E> extends JComboBox<E> {

    public DialogBox(E[] items){
        super(items);
        lookAndFeel();
    }

    private void lookAndFeel(){
        setForeground(Color.white);
        setBackground(new Color(0,0,0));
        setBorder(new EmptyBorder(0, 0, 0, 0));
        setUI(new BasicComboBoxUI(){
            @Override
            protected JButton createArrowButton(){
                JButton button = new JButton() {
                    @Override
                    public Dimension getPreferredSize(){
                        return new Dimension(0, 0);
                    }
                };
                button.setContentAreaFilled(false);
                button.setFocusPainted(false);
                button.setBorderPainted(false);
                return button;
            }
            @Override
            public void paintCurrentValueBackground(Graphics g, Rectangle bounds, boolean hasFocus){
                g.setColor(comboBox.getBackground());
                g.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);
            }
            @Override
            public void paintCurrentValue(Graphics g, Rectangle bounds, boolean hasFocus){
                if (comboBox.getSelectedItem() == null) return;
                g.setColor(comboBox.getForeground());
                g.setFont(comboBox.getFont());
                String text = comboBox.getSelectedItem().toString();
                g.drawString(text, bounds.x, bounds.y + bounds.height - g.getFontMetrics().getDescent());
            }
        });
    }
}
