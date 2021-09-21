package Restaurant;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Date;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Map;

public class Menu {
    private List<MenuItem> menuItems = new ArrayList<MenuItem>();
    private Date lastModifiedDate;
    private Set<MenuItem> uniqueMenuItems = new HashSet<MenuItem>();

    public Menu(List<MenuItem> menuItems) {
       menuItems = duplicateMenuItemsCheck(menuItems);
        this.menuItems = menuItems;
        setLastModifiedDate(new Date());
    }

    private List<MenuItem> duplicateMenuItemsCheck(List<MenuItem> menuItems) {
        uniqueMenuItems.addAll(menuItems);
        if (menuItems.size() != uniqueMenuItems.size()) {
            System.out.println("### Warning you tried to add a duplicate menu item, ignore it and moving on ###");
        }
        return uniqueMenuItems.stream().collect(Collectors.toList());
    }

    public Menu() {

    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void addMenuItem(MenuItem menuItem) {
        if (duplicateMenuItemCheck(menuItem))
            return;
        this.menuItems.add(menuItem);
        setLastModifiedDate(new Date());
    }

    public boolean duplicateMenuItemCheck(MenuItem menuItem) {
        if (!uniqueMenuItems.add(menuItem)) {
            System.out.println("### warning trying to add duplicate record");
            return true;
        }
        return false;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public boolean removeMenuItem(MenuItem menuItem) {
        setLastModifiedDate(new Date());
        return menuItems.remove(menuItem);
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public void printMenu() {
        System.out.println("---------- Menu ----------");
        System.out.println("Modified on " + lastModifiedDate);
        Map<MenuItem.Category, List<MenuItem>> menuItemsGroupedByCategory =
                this.getMenuItems().stream()
                        .collect(Collectors.groupingBy(MenuItem::getCategory));
        System.out.println("Menu Items Grouping Map"+menuItemsGroupedByCategory);
        System.out.println("------- Menu Items -------");
        menuItemsGroupedByCategory.forEach((key, value) -> {
            System.out.println(key);
            getPrintUnderScores(key.toString().length());
            for (int i = 0; i < value.size(); i++) {
                System.out.println(value.get(i));
            }
            System.out.println("");
        });
        System.out.println("------- Menu Items -------");
    }

    private void getPrintUnderScores(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("_");
        }
        System.out.println("");
    }
}