package io.github.gageallencarpenter.view.button;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * A custom renderer for the buttons in JTables.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class RenderButton extends DefaultTableCellRenderer{

    /**
     * If the value of the cell is a JButton, return the JButton, otherwise return the default renderer.
     *
     * @param table The table that is asking the renderer to draw; can be used to get the foreground/background color for example.
     * @param value The value of the cell being rendered.
     * @param isSelected true if the cell is to be rendered with the selection highlighted; otherwise false.
     * @param hasFocus true if the cell has focus, false otherwise
     * @param row The row of the cell being rendered.
     * @param column The column of the cell being rendered.
     * @return A JButton if the value of the cell is a JButton, otherwise the default renderer.
     */
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
    {
        if(value instanceof JButton jButton){
            return jButton;
        }
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
}
