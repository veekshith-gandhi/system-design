package Abstract;

public class Client {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2021, 4);
        car.start();
        car.showCarInfo();
        car.stop();

        System.out.println();

        Car car1 = new Car("Celerio", 2025, 3);
        car1.showCarInfo();
        car1.stop();

        System.out.println();

        ElectricScooter scooter = new ElectricScooter("Ola", 2023, 80);
        scooter.start();
        scooter.showInfo();
        scooter.showBattery();
        scooter.stop();

        System.out.println("\nTotal vehicles created: " + Vehicle.getVehicleCount());
    }
}
