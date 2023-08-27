package io.github.gageallencarpenter.controller;

import io.github.gageallencarpenter.view.panel.services.ITable;

import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 * A wrapper for a table that provides a row sorter
 */
public record TableSort(ITable table, TableRowSorter<? extends TableModel> sorter) {

    /**
     * Constructs a new TableSort object.
     *
     * @param table The table to be sorted.
     */
    public TableSort(ITable table) {
        this(table, new TableRowSorter<>(table.getTable().getModel()));
        table.getTable().setRowSorter(sorter);
    }
}
