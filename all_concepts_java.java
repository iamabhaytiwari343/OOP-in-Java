// Encapsulation
class Car {
    private String make;
    private String model;
    private int year;
    private int speed;

    public Car(String make, String model, int year) {
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

// Polymorphism
class GasolineCar extends Car {
    private int fuelCapacity;

    public GasolineCar(String make, String model, int year, int fuelCapacity) {
        super(make, model, year);
        this.fuelCapacity = fuelCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    // Overriding accelerate method to demonstrate polymorphism
    @Override
    public void accelerate() {
        speed += 5;
    }
}

// Abstraction
abstract class Vehicle {
    public abstract void startEngine();
}

class ElectricVehicle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Starting electric engine");
    }
}

class GasolineVehicle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Starting gasoline engine");
    }
}

public class Main {
    public static void main(String[] args) {
        ElectricCar myElectricCar = new ElectricCar("Tesla", "Model S", 2023, 75);
        GasolineCar myGasolineCar = new GasolineCar("Toyota", "Camry", 2023, 15);

        System.out.println("Electric Car:");
        System.out.println("Make: " + myElectricCar.getMake());
        System.out.println("Model: " + myElectricCar.getModel());
        System.out.println("Year: " + myElectricCar.getYear());
        System.out.println("Battery Capacity: " + myElectricCar.getBatteryCapacity() + " kWh");

        System.out.println("\nGasoline Car:");
        System.out.println("Make: " + myGasolineCar.getMake());
        System.out.println("Model: " + myGasolineCar.getModel());
        System.out.println("Year: " + myGasolineCar.getYear());
        System.out.println("Fuel Capacity: " + myGasolineCar.getFuelCapacity() + " gallons");

        myElectricCar.accelerate();
        myGasolineCar.accelerate();
        System.out.println("\nCurrent Speed of Electric Car: " + myElectricCar.getSpeed());
        System.out.println("Current Speed of Gasoline Car: " + myGasolineCar.getSpeed());

        Vehicle electricVehicle = new ElectricVehicle();
        Vehicle gasolineVehicle = new GasolineVehicle();

        System.out.println("\nAbstract Class Example:");
        electricVehicle.startEngine();
        gasolineVehicle.startEngine();
    }
}
