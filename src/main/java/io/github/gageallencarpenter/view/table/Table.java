package io.github.gageallencarpenter.view.table;

import io.github.gageallencarpenter.model.StatusList;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * A custom table.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public class Table extends JTable {

    /**
     * Create a new Table.
     */
    public Table() {
        setShowHorizontalLines(true);
        setGridColor(new Color(0,0,0));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                TableHeader header = new TableHeader(o + "");
                if (i1 == 4 || i1 == 3 || i1 == 2) {
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
                return header;
            }
        });
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean selected, boolean bln1, int i, int i1) {
                if (i1 != 4) {
                    Component com = super.getTableCellRendererComponent(jtable, o, selected, bln1, i, i1);
                    com.setBackground(Color.BLACK);
                    setBorder(noFocusBorder);
                    if (selected) {
                        com.setForeground(new Color(15, 89, 140));
                    } else {
                        com.setForeground(new Color(255,255,255));
                    }
                    return com;
                } else {
                    StatusList type = (StatusList) o;
                    return new CellStatus(type);
                }
            }
        });
    }

    /**
     * receive a row to the table.
     *
     * @param row The row to receive.
     */
    public void addRow(Object[] row) {
        try{
            SwingUtilities.invokeLater(()->{
                DefaultTableModel model = (DefaultTableModel) getModel();
                model.addRow(row);
            });
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * remove a row from the table.
     *
     * @param row The row to remove.
     */
    public void removeRow(int row){
        try{
            DefaultTableModel model = (DefaultTableModel) getModel();
            model.removeRow(row);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * remove all rows from the table.
     */
    public void removeAllRows() {
        try{
            SwingUtilities.invokeLater(()->{
                DefaultTableModel model = (DefaultTableModel) getModel();
                model.setRowCount(0);
            });
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @SuppressWarnings("DuplicatedCode")
    public void updateRow(int rowIndex, Object[] rowData) {
        try{
            SwingUtilities.invokeLater(()->{
                DefaultTableModel model = (DefaultTableModel) getModel();
                for (int i = 0; i < rowData.length; i++) {
                    model.setValueAt(rowData[i], rowIndex, i);
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @SuppressWarnings("DuplicatedCode")
    public void updateColumn(int columnIndex, Object[] columnData) {
        try{
            SwingUtilities.invokeLater(()->{
                DefaultTableModel model = (DefaultTableModel) getModel();
                for (int i = 0; i < columnData.length; i++) {
                    model.setValueAt(columnData[i], i, columnIndex);
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void updateCell(int rowIndex, int columnIndex, Object cellData) {
        try{
            SwingUtilities.invokeLater(()->{
                DefaultTableModel model = (DefaultTableModel) getModel();
                model.setValueAt(cellData, rowIndex, columnIndex);
            });
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
