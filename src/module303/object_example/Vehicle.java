package module303.object_example;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;

class Vehicle {
    String licensePlate;
    String type;

    // Constructor
    public Vehicle(String licensePlate, String type) {
        this.licensePlate = licensePlate;
        this.type = type;
    }

    public void displayInfo() {
        // TODO: Print license plate and type of the vehicle
        System.out.println(licensePlate);
        System.out.println(type);
    }
}

class Car extends Vehicle {
    int numDoors;

    // Constructor
    public Car(String licensePlate, String type, int numDoors) {
        super(licensePlate, type);
        this.numDoors = numDoors;
    }

    // Override displayInfo() in Car
    public void displayInfo() {
        super.displayInfo(); // Call displayInfo() from the Vehicle superclass
        // TODO: Print the number of doors
        System.out.println(numDoors);
    }
}

class Motorcycle extends Vehicle {
    boolean hasSideCar;

    // Constructor
    public Motorcycle(String licensePlate, String type, boolean hasSideCar) {
        super(licensePlate, type);
        this.hasSideCar = hasSideCar;
    }

    // Override displayInfo() in Motorcycle
    public void displayInfo() {
        super.displayInfo(); // Call displayInfo() from the Vehicle superclass
        // TODO: Print whether the motorcycle has a sidecar
        System.out.println(hasSideCar);
    }
}

class ParkingLot {
    // TODO: Add a list or array to store parked vehicles
    ArrayList<Vehicle> vehicles;
    //Constructor
    public ParkingLot() {
        this.vehicles = new ArrayList<>();
    }


    public void parkVehicle(Vehicle vehicle) {
        // TODO: Implement this method to park the vehicle in the parking lot
        vehicles.add(vehicle);
    }

    // TODO: Add a method to display information about parked vehicles
    public void displayInfo() {
        for (int i = 0; i < vehicles.size(); i++) {
            vehicles.get(i).displayInfo();
        }
    }

}

class Main {
    public static void main(String[] args) {
        // TODO: Create instances of Car, Motorcycle, and ParkingLot
        Car car1 = new Car("COD3", "Sedan", 4);
        Car car2 = new Car("KO43", "Sports", 2);
        // TODO: Park some vehicles in the parking lot
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.parkVehicle(car1);
        parkingLot.parkVehicle(car2);
        // TODO: Display information about the vehicles in the parking lot
        parkingLot.displayInfo();
    }
}

