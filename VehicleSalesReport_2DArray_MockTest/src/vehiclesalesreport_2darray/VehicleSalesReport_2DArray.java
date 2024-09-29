/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiclesalesreport_2darray;

/**
 *
 * @author FS
 */
public class VehicleSalesReport_2DArray {
    public static void main(String[] args) {
        // Sales data
        int[][] sales = {
            {25, 15, 35}, // SUV
            {25, 55, 35}, // COUPE
            {11, 20, 45}, // SEDAN
            {17, 27, 25}  // VAN
        };
        
        String[] vehicleTypes = {"SUV", "COUPE", "SEDAN", "VAN"};
        String[] months = {"JAN", "FEB", "MAR"};
        
        // Print top border
        System.out.println("*****************************************************");
        
        // Print title
        System.out.println("VEHICLE SALES REPORT");
        
        // Print border
        System.out.println("*****************************************************");
        
        // Print column headers
        System.out.printf("%-10s", "");
        for (String month : months) {
            System.out.printf("%-15s", month);
        }
        System.out.println();
        
        // Print sales data
        for (int i = 0; i < sales.length; i++) {
            System.out.printf("%-10s", vehicleTypes[i]);
            for (int j = 0; j < sales[i].length; j++) {
                System.out.printf("%-15d", sales[i][j]);
            }
            System.out.println();
        }
        
        // Print border
        System.out.println("*****************************************************");
        
        // Print "VEHICLE TOTAL SALES"
        System.out.println("VEHICLE TOTAL SALES");
        
        // Print border
        System.out.println("*****************************************************");
        
        // Calculate and print total sales for each vehicle type
        for (int i = 0; i < sales.length; i++) {
            int total = 0;
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
            String status = (total >= 100) ? "Gold Star" : "Silver Star";
            System.out.printf("%-10s%-5d(%s)%n", vehicleTypes[i], total, status);
        }
        
        // Print bottom border
        System.out.println("*****************************************************");
    }
}