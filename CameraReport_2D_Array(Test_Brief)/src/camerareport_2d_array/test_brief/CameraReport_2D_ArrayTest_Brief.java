/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camerareport_2d_array.test_brief;

/**
 *
 * @author FS
 */
// Solution for Question 1: Camera Technology Cost Report
// Import necessary Java utility libraries

import java.util.Arrays;

public class CameraReport_2D_ArrayTest_Brief {
    public static void main(String[] args) {
        // Declare the camera manufacturers as a single-dimensional array
        String[] manufacturers = {"CANON", "SONY", "NIKON"};
        
        // Declare and initialize a 2D array to hold the camera costs for Mirrorless and DSLR
        int[][] cameraCosts = {
            {10500, 8500}, // CANON
            {9500, 7200},  // SONY
            {12000, 8000}  // NIKON
        };
        
        // Calculate the difference between Mirrorless and DSLR for each manufacturer
        int[] costDifference = new int[manufacturers.length];
        int maxDifference = 0;  // To track the maximum cost difference
        String maxDiffManufacturer = "";  // To store the manufacturer with maximum difference

        // Calculate the differences and find the maximum difference
        for (int i = 0; i < manufacturers.length; i++) {
            costDifference[i] = cameraCosts[i][0] - cameraCosts[i][1];
            if (costDifference[i] > maxDifference) {
                maxDifference = costDifference[i];
                maxDiffManufacturer = manufacturers[i];
            }
        }

        // Print the formatted Camera Technology Report
        System.out.println("-----------------------------------------------------------");
        System.out.println("                    CAMERA TECHNOLOGY REPORT              ");
        System.out.println("-----------------------------------------------------------");
        System.out.printf("%-5s %15s %15s\n", "", "MIRRORLESS", "DSLR");
        for (int i = 0; i < manufacturers.length; i++) {
            System.out.printf("%-10s R %10.2f   R %10.2f\n", manufacturers[i], 
                                (double) cameraCosts[i][0], (double) cameraCosts[i][1]);
        }
        System.out.println("-----------------------------------------------------------");
        System.out.println("                    CAMERA TECHNOLOGY RESULTS              ");
        System.out.println("-----------------------------------------------------------");
        // Print the results showing the differences for each manufacturer
        for (int i = 0; i < manufacturers.length; i++) {
            // Determine if "***" should be printed based on the condition
            String stars = costDifference[i] >= 2500 ? "***" : "";
            System.out.printf("%-10s R %10.2f %s\n", manufacturers[i], (double) costDifference[i], stars);
        }
        System.out.println("-----------------------------------------------------------");
        System.out.printf("CAMERA WITH THE MOST COST DIFFERENCE: %s\n", maxDiffManufacturer);
        System.out.println("-----------------------------------------------------------");
    }
}