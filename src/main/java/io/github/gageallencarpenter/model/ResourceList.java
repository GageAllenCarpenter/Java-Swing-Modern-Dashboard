package io.github.gageallencarpenter.model;

import java.util.ArrayList;
import java.util.List;

public class ResourceList {
    private final String icon;
    private final String name;
    private final MenuList menu;
    private final String url;
    private static final List<ResourceList> RESOURCES = new ArrayList<>();

    public static final ResourceList CHROME = new ResourceList("chrome", "Browser", MenuList.MENU,"https://www.google.com/chrome/");
    public static final ResourceList OFFICE = new ResourceList("office", "Microsoft Office", MenuList.MENU,"https://www.office.com/");

    private ResourceList(String icon, String name, MenuList menu, String url) {
        this.icon = icon;
        this.name = name;
        this.menu = menu;
        this.url = url;
        RESOURCES.add(this);
    }

    public String getIcon() {
        return icon;
    }

    public String getName() {
        return name;
    }

    public MenuList getMenu() {
        return menu;
    }

    public String getUrl() {
        return url;
    }

    public static void addResource(ResourceList resource) {
        RESOURCES.add(resource);
    }

    public static int size() {
        return RESOURCES.size();
    }

    public static List<ResourceList> getResources() {
        return RESOURCES;
    }
}
