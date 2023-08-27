package io.github.gageallencarpenter.view.record;

import io.github.gageallencarpenter.model.MenuList;

import javax.swing.*;
import java.util.Objects;

/**
 * A model that represents a menu item.
 *
 * @param icon The icon of the menu item.
 * @param name The name of the menu item.
 * @param type The type of the menu item.
 *
 * @author <a href="https://www.linkedin.com/in/gage-carpenter-07750a174/">Gage Carpenter</a>
 */
public record MenuModel(String icon, String name, MenuList type) {

    /**
     * Gets the icon of the menu item.
     * @return The icon of the menu item.
     */
    public Icon toIcon() {
        return new ImageIcon(Objects.requireNonNull(getClass().getResource("/icon/" + icon + ".png")));
    }
}
