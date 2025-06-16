package Abstract;

class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, int year, int numDoors) {
        super(brand, year); // Call parent constructor
        this.numDoors = numDoors;
    }

    @Override
    public void start() {
        System.out.println("Car starts with a key.");
    }

    @Override
    public void stop() {
        System.out.println("Car stops with a brake.");
    }

    public void showCarInfo() {
        showInfo(); // Call base class method
        System.out.println("Doors: " + numDoors);
    }
}
