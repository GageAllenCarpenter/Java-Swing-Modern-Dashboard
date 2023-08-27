package io.github.gageallencarpenter.view.panel.services;

import io.github.gageallencarpenter.view.table.Table;

/**
 * Type used to get Tables from the application
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
@FunctionalInterface
public interface ITable {

    /**
     * Get the table.
     *
     * @return The table.
     */
    Table getTable();
}
