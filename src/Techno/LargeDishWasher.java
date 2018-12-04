package Techno;

public class LargeDishWasher extends DishWasherMaker {
    @Override
    void makeSize() {
        dishWasher.setSize(Size.FULLSIZE);
    }

    @Override
    void makeColor() {
    dishWasher.setColor("White");
    }

    @Override
    void makePrice() {
    dishWasher.setPrice(1000);
    }

    @Override
    void makeComplectsOfDishes() {
   dishWasher.setComplectsOfDishes(12);
    }
}
