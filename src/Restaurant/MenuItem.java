package Restaurant;


import java.util.Objects;

public class MenuItem {

    private double price;
    private String description;
    private Category category;
    boolean isNew;

    public MenuItem (double price, Category category,String description, boolean isNew){
        this.price = price;
        this.category = category;
        this.description = description;
        this.isNew = isNew;

    }


    // default constructor
    public MenuItem(){

    }

    public double getPrice() {
        return price;
    }
     public void setPrice(double price){
        this.price = price;

     }
     public String getDescription(){
        return description;
     }
     public void setDescription(String description){
        this.description = description;
     }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
    enum Category {
        APPETIZER,
        MAIN_COURSE,
        DESSERT
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, description, category);
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o==null || getClass()!= o.getClass())return false;
        MenuItem menuItem = (MenuItem) o;
        return Double.compare(menuItem.price,price) == 0 && Objects.equals(description,menuItem.description)
                && category == menuItem.category;
    }

    public String toString(){
        return  description +" " + price +" ";
    }
}
