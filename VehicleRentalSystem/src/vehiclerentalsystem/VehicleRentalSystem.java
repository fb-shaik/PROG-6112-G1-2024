/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiclerentalsystem;

import java.util.Scanner;
// Main class to test the implementation
public class VehicleRentalSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Vehicle Rental System!");

        System.out.println("Please select a vehicle type to rent: ");
        System.out.println("1. Car");
        System.out.println("2. Motorcycle");
        System.out.println("3. Truck");
        int choice = scanner.nextInt();

        Vehicle vehicle = null;

        switch (choice) {
            case 1:
                vehicle = Car.createCar(scanner);
                break;
            case 2:
                vehicle = Motorcycle.createMotorcycle(scanner);
                break;
            case 3:
                vehicle = Truck.createTruck(scanner);
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.print("Enter the number of days you want to rent the vehicle: ");
        int days = scanner.nextInt();

        System.out.println("Vehicle Details: " + vehicle.getDetails());
        System.out.println("Total Rental Cost for " + days + " days: $" + vehicle.calculateRentalCost(days));
    }
}