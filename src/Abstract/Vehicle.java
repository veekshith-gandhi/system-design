package Abstract;

abstract class Vehicle {
    // Instance fields
    private String brand;
    private int year;

    // Static field
    private static int vehicleCount = 0;

    // Constructor
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
        vehicleCount++;
    }

    // Abstract method (must be implemented by subclass)
    public abstract void start();

    public abstract void stop();

    // Concrete method (shared by all vehicles)
    public void showInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }

    // Static method
    public static int getVehicleCount() {
        return vehicleCount;
    }

    // Getter and Setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
