class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("Speed: " + maxSpeed + ", Fuel: " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;

    Car(int speed, String fuel, int seats) {
        super(speed, fuel);
        this.seatCapacity = seats;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Seats: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    int loadCapacity;

    Truck(int speed, String fuel, int load) {
        super(speed, fuel);
        this.loadCapacity = load;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Load: " + loadCapacity + " tons");
    }
}

class Motorcycle extends Vehicle {
    boolean hasGear;

    Motorcycle(int speed, String fuel, boolean gear) {
        super(speed, fuel);
        this.hasGear = gear;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Has Gear: " + hasGear);
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car(180, "Petrol", 5),
            new Truck(100, "Diesel", 10),
            new Motorcycle(120, "Petrol", true)
        };

        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }
}
