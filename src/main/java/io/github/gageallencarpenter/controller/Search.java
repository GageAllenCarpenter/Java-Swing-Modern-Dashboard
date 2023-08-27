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

    /**
     * Searches for apps using the specified text and updates the app table with the search results.
     *
     * @param text The text to search for.
     */
    public void searchApps(String text){
        apps.clear();
        try{
            apps = powershell.execute("choco find " + text);
        }catch (Exception e){
            new Error("Failed to search for" + text);
        }
        apps.removeIf(s -> s.contains("Chocolatey v") || s.contains("packages found") || s.isEmpty());
        for (int idx = 0; idx < apps.size(); idx++) {
            String app = apps.get(idx);
            int spaceIndex = app.indexOf(' ');
            if (spaceIndex >= 0) {
                apps.set(idx, app.substring(0, spaceIndex));
            }
        }
        SwingUtilities.invokeLater(()->{
            for(String app: apps){
                AppTablePanel.getInstance().getTable().addRow(new Object[]{app,0,AppTablePanel.getInstance().getInstallButton(), AppTablePanel.getInstance().getUninstallButton()});
            }
        });
    }
}
