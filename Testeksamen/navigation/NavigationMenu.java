package navigation;

import java.util.ArrayList;
import java.util.List;

public class NavigationMenu extends NavigationComponent
{
    private String name;
    List<NavigationItem> menuItems;

    public NavigationMenu(String name)
    {
        this.name = name;
    }

    public void addItem(String name, String link) {
        NavigationItem navigationItem = new NavigationItem(name,link);
        menuItems.add(navigationItem);
    }

    public List<NavigationItem> getMenuItems() {
        return menuItems;
    }



}

