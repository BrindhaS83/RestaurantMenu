package Restaurant;

import java.util.Collection;
import java.util.Date;


public class Menu {
    private Collection<MenuItem> menuItems;
    private Date lastModifiedDate;

    public Menu(Collection<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
    public Menu(){

    }
    public Collection<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(Collection<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}