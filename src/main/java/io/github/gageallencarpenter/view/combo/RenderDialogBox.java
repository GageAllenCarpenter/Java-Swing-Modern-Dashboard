package io.github.gageallencarpenter.view.combo;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class RenderDialogBox<E> extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
    {
        if(value instanceof DialogBox<?>){
            //noinspection unchecked
            return (DialogBox<E>)value;
        }
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }

}
