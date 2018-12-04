package Techno;

public class DishWashers  {
    private int complectsOfDishes;
    private Size size;
    private String color;
    private int price;


    public void setComplectsOfDishes(int complectsOfDishes) {
        this.complectsOfDishes = complectsOfDishes;
    }

    public void setSize(Size size) {
       this.size= size ;}

        public void setColor(String color) {
            this.color = color;
        }

        public void setPrice(int price) {
            this.price = price;
        }

    @Override
    public String toString() {
        return "DishWashers{" +
                "complectsOfDishes=" + complectsOfDishes +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}

