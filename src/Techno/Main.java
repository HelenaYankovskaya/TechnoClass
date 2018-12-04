package Techno;

public class Main extends OperationTechno {
    public static void main(String[] args) {   //Задание № 24 страница 56  РТ-1
           Seller seller = new Seller();
           OperationTechno operationTechno = new OperationTechno();

           seller.setDishWasherMaker(new LargeDishWasher());     //1
        DishWashers dishWashers = seller.offerDishWasher();
        System.out.println(dishWashers);
         operationTechno.off();
         operationTechno.printState();

        seller.setDishWasherMaker(new SmallDishWasher());            //2
        DishWashers dishWashers1 = seller.offerDishWasher();
        System.out.println(dishWashers1);
        operationTechno.on();
        operationTechno.printState();
    }
}
