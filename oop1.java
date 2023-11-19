public class oop1 {
    
}
class car{
    private String make;
    private String model;
    private int year;
    private int speed;

    public car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = 0;
    }
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void accelerate() {
        speed += 10;
    }

    public void brake() {
        speed -= 10;
    }

    public int getSpeed() {
        return speed;
    }
}
// Inheritance
class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(String make, String model, int year, int batteryCapacity) {
        super(make, model, year);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }
}

