package Abstract;

class ElectricScooter extends Vehicle {
    private int batteryLevel;

    public ElectricScooter(String brand, int year, int batteryLevel) {
        super(brand, year);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void start() {
        System.out.println("Scooter starts with a button.");
    }

    @Override
    public void stop() {
        System.out.println("Scooter uses electric brakes.");
    }

    public void showBattery() {
        System.out.println("Battery Level: " + batteryLevel + "%");
    }
}
