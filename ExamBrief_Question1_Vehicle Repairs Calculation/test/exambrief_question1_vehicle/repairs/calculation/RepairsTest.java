/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package exambrief_question1_vehicle.repairs.calculation;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

// Make sure the class is public
public class RepairsTest {

    private Repairs repairs;

    @Before
    public void setUp() {
        repairs = new Repairs();
    }

    /**
     * Test to verify that calculateRepairCosts method returns the correct total repair cost.
     */
    @Test
    public void calculateCosts_ReturnsRepairCosts() {
        double[] repairCosts = {8000, 2500, 5000};
        double expectedTotal = 15500;
        
        double actualTotal = repairs.calculateRepairCosts(repairCosts);
        
        assertEquals("The total repair costs should be 15500.", expectedTotal, actualTotal, 0.001);
    }

    /**
     * Test to verify that calculateTechnicianPay method calculates the correct 10% commission.
     */
    @Test
    public void calculatePay_ReturnsExpectedPay() {
        double totalAmount = 15500;
        double expectedPay = 1550;
        
        double actualPay = repairs.calculateTechnicianPay(totalAmount);
        
        assertEquals("The technician's pay should be 1550.", expectedPay, actualPay, 0.001);
    }

    /**
     * Test to verify that getTopTechnician method correctly identifies the technician
     * with the highest repair total.
     */
    @Test
    public void topTechnician_ReturnsTopPosition() {
        double[] totalRepairs = {15500, 14800};  // Joe Bloggs has the highest repair total
        int expectedTopTechnicianIndex = 0;      // Index 0 represents Joe Bloggs
        
        int actualTopTechnicianIndex = repairs.getTopTechnician(totalRepairs);
        
        assertEquals("The top technician should be at index 0 (Joe Bloggs).", expectedTopTechnicianIndex, actualTopTechnicianIndex);
    }
}
