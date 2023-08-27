package io.github.gageallencarpenter.view.list;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Used to handle when a user selects a menu item.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
@FunctionalInterface
public interface MenuInterface {

    /**
     * Called when a menu item is selected.
     *
     * @param index The index of the selected menu item.
     * @throws URISyntaxException If the URI is invalid.
     * @throws IOException If the file cannot be opened.
     */
    void selected(int index) throws URISyntaxException, IOException;
}
