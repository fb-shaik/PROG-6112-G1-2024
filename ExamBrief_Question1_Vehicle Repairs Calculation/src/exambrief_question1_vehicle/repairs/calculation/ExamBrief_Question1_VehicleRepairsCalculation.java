
package exambrief_question1_vehicle.repairs.calculation;


public class ExamBrief_Question1_VehicleRepairsCalculation {

   
    public static void main(String[] args) {
        // Initialize 2D array with repair data
        double[][] repairData = {
            {8000, 2500, 5000}, // Joe Bloggs
            {7000, 2200, 5600}  // Jane Doe
        };
        String[] technicians = {"Joe Bloggs", "Jane Doe"};

        Repairs repairs = new Repairs();
        
        double[] totalRepairs = new double[repairData.length];
        double[] technicianPay = new double[repairData.length];
        
        // Print header
        System.out.println("TECHNICIAN VEHICLE REPAIR REPORT");
        System.out.println();
        System.out.printf("%-15s %-15s %-15s %-15s\n", " ", "JAN", "FEB", "MAR");
        System.out.println("-------------------------------------------------------");
        
        // Print repair data for each technician
        for (int i = 0; i < repairData.length; i++) {
            totalRepairs[i] = repairs.calculateRepairCosts(repairData[i]);
            technicianPay[i] = repairs.calculateTechnicianPay(totalRepairs[i]);
            
            System.out.printf("%-15s R %-14.1f R %-14.1f R %-14.1f\n",
                    technicians[i],
                    repairData[i][0],
                    repairData[i][1],
                    repairData[i][2]
            );
        }
        
        System.out.println();
        
        // Print total repairs and commission for each technician
        for (int i = 0; i < repairData.length; i++) {
            System.out.printf("Total vehicle repairs for %s = R %.0f\n", technicians[i], totalRepairs[i]);
        }
        
        System.out.println();
        
        // Print commission for each technician
        for (int i = 0; i < repairData.length; i++) {
            System.out.printf("Repair Commission for %s = R %.0f\n", technicians[i], technicianPay[i]);
        }
        
        System.out.println();
        
        // Identify the top technician
        int topTechnician = repairs.getTopTechnician(totalRepairs);
        System.out.println("Top performing vehicle repair technician: " + technicians[topTechnician]);
    }
}