package Techno;

public class Seller  {
    DishWasherMaker dishWasherMaker;

    public void setDishWasherMaker(DishWasherMaker dishWasherMaker) {
        this.dishWasherMaker = dishWasherMaker;
    }

    DishWashers offerDishWasher(){

        dishWasherMaker.createDishWasher();
        dishWasherMaker.makeColor();
        dishWasherMaker.makeComplectsOfDishes();
        dishWasherMaker.makePrice();
        dishWasherMaker.makeSize();

        DishWashers dishWashers = dishWasherMaker.getDishwasher();
        return dishWashers;
    }
}
