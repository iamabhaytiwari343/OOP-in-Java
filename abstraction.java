public class abstraction {
    
}
abstract class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Abstract method - to be implemented by subclasses
    public abstract void start();

    // Concrete method
    public void stop() {
        System.out.println("The " + year + " " + brand + " " + model + " has stopped.");
    }

    public void accelerate() {
        System.out.println("The " + year + " " + brand + " " + model + " is accelerating.");
    }

    public void brake() {
        System.out.println("The " + year + " " + brand + " " + model + " is braking.");
    }
}
