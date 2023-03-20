public class Main {

    public static void main(String[] args) {

//        Refrigerator refrigerator = new Refrigerator(false);
//        DishWasher dishWasher = new DishWasher(false);
//        CoffeeMaker coffeeMaker = new CoffeeMaker(false);
//
//        SmartKitchen smartKitchen = new SmartKitchen(coffeeMaker, refrigerator, dishWasher
//        );
//
//        smartKitchen.addWater();
//        smartKitchen.pourMilk();
//        smartKitchen.loadDishwasher();
//
//        smartKitchen.setKitchenState(true,false,
//                true);
//
//        smartKitchen.getIceBox().orderFood();
//        smartKitchen.getDishWasher().doDishes();
//        smartKitchen.getBrewMaster().brewCoffee();
//
//        smartKitchen.doKitchenWork();
//
//

        SmartKitchen kitchen = new SmartKitchen();

        kitchen.setKitchenState(true, false, true);
        kitchen.doKitchenWork();
    }
}
