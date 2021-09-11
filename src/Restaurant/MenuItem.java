package Restaurant;



public class MenuItem {

    private double price;
    private String description;
    private Category category;
    boolean isNew;

    public MenuItem (double price, Category category){
        this.price = price;
        this.category = category;

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
}
