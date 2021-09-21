package Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    public static void main(String[] args){
        List<MenuItem> list  = new ArrayList<>();
        //MenuItem menuItem = new MenuItem(5.0, MenuItem.Category.MAIN_COURSE, "Burger", true);
        list.add(new MenuItem(15.0, MenuItem.Category.MAIN_COURSE, "Burger", true));
        list.add(new MenuItem(15.0, MenuItem.Category.MAIN_COURSE, "Burger", true));
        list.add(new MenuItem(15.0, MenuItem.Category.APPETIZER, "French Fries", true)) ;
        list.add(new MenuItem(5.0, MenuItem.Category.DESSERT, "Chocolate Ice cream", false)) ;
        list.add(new MenuItem(35.0, MenuItem.Category.MAIN_COURSE, "Pizza", true));
        list.add(new MenuItem(10.0, MenuItem.Category.APPETIZER, "Chips", true)) ;
        list.add(new MenuItem(12.0, MenuItem.Category.DESSERT, "Strawberry Ice cream", true)) ;
        list.add(new MenuItem(35.0, MenuItem.Category.MAIN_COURSE, "Toast", true));
        list.add(new MenuItem(10.0, MenuItem.Category.APPETIZER, "Cheese Sticks", true)) ;
        list.add(new MenuItem(12.0, MenuItem.Category.DESSERT, "Black forest Ice cream", true)) ;
        list.add(new MenuItem(25.0, MenuItem.Category.DESSERT , "Oreo Chocolate Ice cream", true)) ;

        System.out.println(list);
        Menu menu = new Menu(list);
        System.out.println("Individual Menu item");
        MenuItem duplicate = new MenuItem(15.0, MenuItem.Category.MAIN_COURSE, "Burger", true);
        menu.addMenuItem(duplicate);
        //list.remove(1);
        System.out.println(list);
        menu.printMenu();

        MenuItem originalMainCourse = new MenuItem(15.0, MenuItem.Category.MAIN_COURSE, "Burger", true);
        MenuItem duplicateMainCourse = new MenuItem(15.0, MenuItem.Category.MAIN_COURSE, "Burger", true);
        System.out.println(originalMainCourse.equals(duplicateMainCourse));
        MenuItem differentDessert = new MenuItem(15.0, MenuItem.Category.DESSERT, "Burger", true);
        System.out.println(originalMainCourse.equals(differentDessert));
    }
}