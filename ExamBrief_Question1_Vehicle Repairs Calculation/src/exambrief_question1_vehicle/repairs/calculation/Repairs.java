/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exambrief_question1_vehicle.repairs.calculation;

// Repairs.java - Class Implementation
public class Repairs implements IRepairs {
    // Calculate the total repair costs for each technician
    @Override
    public double calculateRepairCosts(double[] repairCosts) {
        double total = 0;
        for (double cost : repairCosts) {
            total += cost;
        }
        return total;
    }

    // Calculate 10% pay for a technician
    @Override
    public double calculateTechnicianPay(double totalAmount) {
        return totalAmount * 0.10;
    }

    // Determine the top-performing technician based on total repairs
    @Override
    public int getTopTechnician(double[] totalRepairs) {
        int topIndex = 0;
        double maxRepairs = totalRepairs[0];
        for (int i = 1; i < totalRepairs.length; i++) {
            if (totalRepairs[i] > maxRepairs) {
                maxRepairs = totalRepairs[i];
                topIndex = i;
            }
        }
        return topIndex;
    }
}