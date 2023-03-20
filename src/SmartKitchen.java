public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private Refrigerator iceBox;
    private DishWasher dishWasher;

    public SmartKitchen(){
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
    }

    public SmartKitchen(CoffeeMaker brewMaster, Refrigerator iceBox, DishWasher dishWasher) {
        this.brewMaster = brewMaster;
        this.iceBox = iceBox;
        this.dishWasher = dishWasher;
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void addWater() {

        brewMaster.setHasWorkToDo(true);

    }

    public void pourMilk() {

        iceBox.setHasWorkToDo(true);

    }

    public void loadDishwasher() {

        dishWasher.setHasWorkToDo(true);

    }

    public void setKitchenState(boolean cmHasWorkToDo, boolean rHasWorkToDo,
                           boolean dWHasWorkToDo) {

        brewMaster.setHasWorkToDo(cmHasWorkToDo);
        iceBox.setHasWorkToDo(rHasWorkToDo);
        dishWasher.setHasWorkToDo(dWHasWorkToDo);

    }

    public void doKitchenWork() {
        iceBox.orderFood();
        dishWasher.doDishes();
        brewMaster.brewCoffee();
    }
}

class CoffeeMaker {

    private boolean hasWorkToDo;

    public CoffeeMaker() {
    }

    public CoffeeMaker(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("Brewing coffee");
            hasWorkToDo = false;
        }
    }
}

class Refrigerator {

    private boolean hasWorkToDo;

    public Refrigerator() {
    }

    public Refrigerator(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("Ordering some food.");
            hasWorkToDo = false;
        }
    }
}

class DishWasher {

    private boolean hasWorkToDo;

    public DishWasher() {
    }

    public DishWasher(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("Running dishwasher");
            hasWorkToDo = false;
        }
    }
}

