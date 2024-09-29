
package flowershop;

/*
 * FlowerShop application to manage and display sales data for a flower shop.
 * The program collects sales data for different types of bouquets sold on each day of the week,
 * calculates totals, identifies the most popular bouquets and days, and displays the results.
 */

import java.util.Scanner; // Import Scanner class for user input

public class FlowerShop {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Define arrays for days of the week and bouquet types sold
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String[] bouquetTypes = {"Roses", "Tulips", "Lilies"};

        // Initialize a 2D array to store sales data; rows represent days, columns represent bouquet types
        int[][] sales = new int[days.length][bouquetTypes.length];

        // Input sales data from the user for each day and bouquet type
        for (int i = 0; i < days.length; i++) {
            System.out.println("Enter sales for " + days[i] + ":");
            for (int j = 0; j < bouquetTypes.length; j++) {
                System.out.print("  " + bouquetTypes[j] + ": ");
                sales[i][j] = scanner.nextInt(); // Read sales number for each bouquet type on the given day
            }
        }

        // Display the sales data in a formatted table
        System.out.println("\nSales Data:");
        System.out.printf("%-10s", "Day"); // Print header for days
        for (String type : bouquetTypes) {
            System.out.printf("%-10s", type); // Print header for bouquet types
        }
        System.out.println();

        // Loop through the sales array to print each day's sales data
        for (int i = 0; i < sales.length; i++) {
            System.out.printf("%-10s", days[i]); // Print the day name
            for (int j = 0; j < sales[i].length; j++) {
                System.out.printf("%-10d", sales[i][j]); // Print sales numbers for each bouquet type
            }
            System.out.println();
        }

        // Initialize an array to hold total sales for each bouquet type
        int[] bouquetTotals = new int[bouquetTypes.length];
        int maxBouquetSales = 0; // Variable to track the maximum sales among bouquet types

        // Calculate total sales for each bouquet type and find the maximum sales
        for (int j = 0; j < bouquetTypes.length; j++) {
            for (int i = 0; i < days.length; i++) {
                bouquetTotals[j] += sales[i][j]; // Sum sales of each bouquet type over all days
            }
            // Update maxBouquetSales if the current type's total is the highest seen so far
            if (bouquetTotals[j] > maxBouquetSales) {
                maxBouquetSales = bouquetTotals[j];
            }
        }

        // Display total sales per bouquet type, marking the type with the highest sales
        System.out.println("\nTotal Sales Per Bouquet Type:");
        for (int j = 0; j < bouquetTypes.length; j++) {
            System.out.printf("%-10s: %d%s\n", bouquetTypes[j], bouquetTotals[j],
                              bouquetTotals[j] == maxBouquetSales ? " ***" : ""); // Mark highest with ***
        }

        // Initialize an array to hold total sales for each day
        int[] dayTotals = new int[days.length];
        int maxDaySales = 0; // Variable to track the maximum sales among days

        // Calculate total sales for each day and find the maximum sales
        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < bouquetTypes.length; j++) {
                dayTotals[i] += sales[i][j]; // Sum sales of all bouquet types for each day
            }
            // Update maxDaySales if the current day's total is the highest seen so far
            if (dayTotals[i] > maxDaySales) {
                maxDaySales = dayTotals[i];
            }
        }

        // Display total sales per day, marking the day with the highest sales
        System.out.println("\nTotal Sales Per Day:");
        for (int i = 0; i < days.length; i++) {
            System.out.printf("%-10s: %d%s\n", days[i], dayTotals[i],
                              dayTotals[i] == maxDaySales ? " ***" : ""); // Mark highest with ***
        }

        // Calculate overall sales by summing total sales of all bouquet types
        int overallSales = 0;
        for (int total : bouquetTotals) {
            overallSales += total;
        }
        // Display overall sales
        System.out.println("\nOverall Sales: " + overallSales);

        // Close the Scanner to prevent resource leaks
        scanner.close();
    }
}
