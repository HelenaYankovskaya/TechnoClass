package Techno;

public class SmallDishWasher extends DishWasherMaker {
    @Override
    void makeSize() {
        dishWasher.setSize(Size.COMPACT);
    }

    @Override
    void makeColor() {
          dishWasher.setColor("Silver");
    }

    @Override
    void makePrice() {
    dishWasher.setPrice(600);
    }

    @Override
    void makeComplectsOfDishes() {
        dishWasher.setComplectsOfDishes(6);
    }
}
