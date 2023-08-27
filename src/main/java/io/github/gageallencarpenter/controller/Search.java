package io.github.gageallencarpenter.controller;

import io.github.gageallencarpenter.Powershell;
import io.github.gageallencarpenter.view.frame.Error;
import io.github.gageallencarpenter.view.panel.services.AppTablePanel;
import io.github.gageallencarpenter.view.panel.services.CompanyTablePanel;
import io.github.gageallencarpenter.view.panel.services.ServiceTablePanel;

import javax.swing.*;
import javax.swing.table.TableModel;
import javax.swing.table.TableStringConverter;
import java.util.ArrayList;
import java.util.List;

public class Search {

    private final ArrayList<TableSort> tables = new ArrayList<>();
    private List<String> apps = new ArrayList<>();
    private final Powershell powershell = new Powershell();

    /**
     * Constructs a new Search object.
     */
    public Search(){
        addTables();
    }

    /**
     * Adds tables to the list of tables to be sorted.
     */
    private void addTables(){
        tables.add(new TableSort(ServiceTablePanel.getInstance()));
        tables.add(new TableSort(AppTablePanel.getInstance()));
        tables.add(new TableSort(CompanyTablePanel.getInstance()));
    }

    /**
     * Filters rows in all tables using the specified text as a regular expression.
     *
     * @param text The text to use as a filter.
     */
    public void searchRows(String text){
        for(TableSort table : tables){
            table.sorter().setStringConverter(new TableStringConverter() {
                @Override
                public String toString(TableModel model, int row, int column) {
                    return model.getValueAt(row, column).toString().toLowerCase();
                }
            });
            table.sorter().setRowFilter(RowFilter.regexFilter("(?i)" + text));
            table.table().getTable().setRowSorter(table.sorter());
            if(table.sorter().getSortKeys().isEmpty()){
                table.sorter().toggleSortOrder(0);
            }
        }
    }
}
