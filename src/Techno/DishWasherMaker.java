package Techno;

public abstract class DishWasherMaker  {
    DishWashers dishWasher;

    void  createDishWasher(){
        dishWasher = new DishWashers();
    }

    abstract void makeSize();
    abstract void makeColor();
    abstract void makePrice();
    abstract void makeComplectsOfDishes();

    DishWashers getDishwasher(){
        return dishWasher;
    }


}
