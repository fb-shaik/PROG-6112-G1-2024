package exambrief_question1_vehicle.repairs.calculation;


// IRepairs.java - Interface Definition
public interface IRepairs {
    double calculateRepairCosts(double[] repairCosts);
    double calculateTechnicianPay(double totalAmount);
    int getTopTechnician(double[] totalRepairs);
}