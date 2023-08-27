package io.github.gageallencarpenter.view.list;

import io.github.gageallencarpenter.model.MenuList;
import io.github.gageallencarpenter.view.panels.MenuItemPanel;
import io.github.gageallencarpenter.view.record.MenuModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * A custom list for displaying the menu items.
 *
 * @param <E> The type of the menu items.
 */
public class MenuFactory<E> extends JList<E> {

    @SuppressWarnings("rawtypes")
    private final DefaultListModel model;
    private int selectedIndex = -1;
    private int overIndex = -1;
    private MenuInterface event;

    /**
     * Create a new MenuFactory.
     */
    public MenuFactory() {
        //noinspection rawtypes
        model = new DefaultListModel();
        //noinspection unchecked
        setModel(model);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    int index = locationToIndex(me.getPoint());
                    Object o = model.getElementAt(index);
                    if (o instanceof MenuModel menu) {
                        if (menu.type() == MenuList.MENU) {
                            selectedIndex = index;
                            if (event != null) {
                                try {
                                    event.selected(index);
                                } catch (URISyntaxException | IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    } else {
                        selectedIndex = index;
                    }
                    repaint();
                }
            }
            @Override
            public void mouseExited(MouseEvent me) {
                overIndex = -1;
                repaint();
            }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent me) {
                int index = locationToIndex(me.getPoint());
                if (index != overIndex) {
                    Object o = model.getElementAt(index);
                    if (o instanceof MenuModel menu) {
                        if (menu.type() == MenuList.MENU) {
                            overIndex = index;
                        } else {
                            overIndex = -1;
                        }
                        repaint();
                    }
                }
            }
        });
        setBackground(new Color(0,0,0,0));
    }

    /**
     * Adds a MenuInterface to the current class.
     *
     * @param event The event that will be called when the menu is clicked.
     */
    public void addMenuInterface(MenuInterface event) {
        this.event = event;
    }


    /**
     * Returns a new `DefaultListCellRenderer` that returns a `MenuItemPanel` for each item in the list
     *
     * @return A new instance of DefaultListCellRenderer
     */
    @Override
    public ListCellRenderer<? super E> getCellRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object o, int index, boolean selected, boolean focus) {
                MenuModel data;
                if (o instanceof MenuModel menuModel) {
                    data = menuModel;
                } else {
                    data = new MenuModel("", o + "", MenuList.EMPTY);
                }
                MenuItemPanel item = new MenuItemPanel(data);
                item.setSelected(selectedIndex == index);
                item.setOver(overIndex == index);
                return item;
            }

        };
    }

    /**
     * Adds an item to the list.
     *
     * @param data The item to receive.
     */
    public void addItem(MenuModel data) {
        //noinspection unchecked
        model.addElement(data);
    }


}
