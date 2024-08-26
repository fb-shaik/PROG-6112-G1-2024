/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiclerentalsystem;
// Base class

import java.util.Scanner;

class Vehicle {
    private String vehicleID;
    private String make;
    private String model;
    private int year;
    private double rentalRatePerDay;

    public Vehicle(String vehicleID, String make, String model, int year, double rentalRatePerDay) {
        this.vehicleID = vehicleID;
        this.make = make;
        this.model = model;
        this.year = year;
        this.rentalRatePerDay = rentalRatePerDay;
    }

    public double calculateRentalCost(int days) {
        return days * rentalRatePerDay;
    }

    public String getDetails() {
        return "Vehicle ID: " + vehicleID + ", Make: " + make + ", Model: " + model + ", Year: " + year;
    }
}

// Subclass for Car
class Car extends Vehicle {
    private int numberOfDoors;
    private String transmissionType;

    public Car(String vehicleID, String make, String model, int year, double rentalRatePerDay, int numberOfDoors, String transmissionType) {
        super(vehicleID, make, model, year, rentalRatePerDay);
        this.numberOfDoors = numberOfDoors;
        this.transmissionType = transmissionType;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Doors: " + numberOfDoors + ", Transmission: " + transmissionType;
    }

    // Static method to create a Car
    public static Car createCar(Scanner scanner) {
        System.out.print("Enter Vehicle ID: ");
        String vehicleID = scanner.next();
        System.out.print("Enter Make: ");
        String make = scanner.next();
        System.out.print("Enter Model: ");
        String model = scanner.next();
        System.out.print("Enter Year: ");
        int year = scanner.nextInt();
        System.out.print("Enter Rental Rate per Day: ");
        double rentalRatePerDay = scanner.nextDouble();
        System.out.print("Enter Number of Doors: ");
        int numberOfDoors = scanner.nextInt();
        System.out.print("Enter Transmission Type (Automatic/Manual): ");
        String transmissionType = scanner.next();

        return new Car(vehicleID, make, model, year, rentalRatePerDay, numberOfDoors, transmissionType);
    }
}

// Subclass for Motorcycle
class Motorcycle extends Vehicle {
    private int engineCapacity;
    private String type;

    public Motorcycle(String vehicleID, String make, String model, int year, double rentalRatePerDay, int engineCapacity, String type) {
        super(vehicleID, make, model, year, rentalRatePerDay);
        this.engineCapacity = engineCapacity;
        this.type = type;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Engine Capacity: " + engineCapacity + "cc, Type: " + type;
    }

    // Static method to create a Motorcycle
    public static Motorcycle createMotorcycle(Scanner scanner) {
        System.out.print("Enter Vehicle ID: ");
        String vehicleID = scanner.next();
        System.out.print("Enter Make: ");
        String make = scanner.next();
        System.out.print("Enter Model: ");
        String model = scanner.next();
        System.out.print("Enter Year: ");
        int year = scanner.nextInt();
        System.out.print("Enter Rental Rate per Day: ");
        double rentalRatePerDay = scanner.nextDouble();
        System.out.print("Enter Engine Capacity (in cc): ");
        int engineCapacity = scanner.nextInt();
        System.out.print("Enter Type (e.g., Cruiser, Sport): ");
        String type = scanner.next();

        return new Motorcycle(vehicleID, make, model, year, rentalRatePerDay, engineCapacity, type);
    }
}

// Subclass for Truck
class Truck extends Vehicle {
    private double loadCapacity;
    private int numberOfAxles;

    public Truck(String vehicleID, String make, String model, int year, double rentalRatePerDay, double loadCapacity, int numberOfAxles) {
        super(vehicleID, make, model, year, rentalRatePerDay);
        this.loadCapacity = loadCapacity;
        this.numberOfAxles = numberOfAxles;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Load Capacity: " + loadCapacity + " tons, Axles: " + numberOfAxles;
    }

    // Static method to create a Truck
    public static Truck createTruck(Scanner scanner) {
        System.out.print("Enter Vehicle ID: ");
        String vehicleID = scanner.next();
        System.out.print("Enter Make: ");
        String make = scanner.next();
        System.out.print("Enter Model: ");
        String model = scanner.next();
        System.out.print("Enter Year: ");
        int year = scanner.nextInt();
        System.out.print("Enter Rental Rate per Day: ");
        double rentalRatePerDay = scanner.nextDouble();
        System.out.print("Enter Load Capacity (in tons): ");
        double loadCapacity = scanner.nextDouble();
        System.out.print("Enter Number of Axles: ");
        int numberOfAxles = scanner.nextInt();

        return new Truck(vehicleID, make, model, year, rentalRatePerDay, loadCapacity, numberOfAxles);
    }
}