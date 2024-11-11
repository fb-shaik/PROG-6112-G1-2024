/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package exambrief_q2_technicianreport;

import org.junit.Test;
import org.junit.Assert;

public class TechnicianReport_GUITest {

    // Create an instance of TechnicianReportGUI for testing
    TechnicianReport_GUI technicianReportGUI = new TechnicianReport_GUI();

    /**
     * Test: CalculatePay_PayCalculatedSuccessfully
     * Purpose: To supply valid repair cost and rate values to calculatePay method 
     * and confirm that the expected pay value is returned.
     */
    @Test
    public void CalculatePay_PayCalculatedSuccessfully() {
        String repairCost = "5000";  // Valid repair cost
        String rate = "10";          // Valid rate as percentage (10%)
        
        // Expected pay calculation: 5000 * (10 / 100) = 500.0
        double expectedPay = 500.0;
        
        // Invoke the calculatePay method
        double actualPay = technicianReportGUI.calculatePay(repairCost, rate);
        
        // Assert that the calculated pay matches the expected pay
        Assert.assertEquals("Pay should be calculated successfully", expectedPay, actualPay, 0.001);
    }

    /**
     * Test: CalculatePay_PayCalculatedUnSuccessfully
     * Purpose: To supply an invalid rate to the calculatePay method and verify that 
     * a NumberFormatException or other error is thrown.
     */
    @Test
    public void CalculatePay_PayCalculatedUnSuccessfully() {
        String repairCost = "5000";         // Valid repair cost
        String invalidRate = "invalidRate"; // Invalid rate that cannot be parsed as a number

        try {
            // Attempt to calculate pay with an invalid rate, expecting an exception
            technicianReportGUI.calculatePay(repairCost, invalidRate);
            // If no exception is thrown, the test should fail
            Assert.fail("Expected NumberFormatException to be thrown due to invalid rate");
        } catch (NumberFormatException e) {
            // Test passes if NumberFormatException is caught
            Assert.assertTrue("NumberFormatException was thrown as expected", true);
        }
    }

    /**
     * Test: Validation Test
     * Purpose: To test that validation correctly fails for an invalid input scenario.
     * Specifically, we test if validation fails when the technician name is empty.
     */
    @Test
    public void ValidationTest() {
        // Invalid case: Technician name is empty
        String location = "Durban";  // Valid location
        String name = "";            // Invalid (empty) technician name
        String repairCost = "5000";   // Valid repair cost
        String rate = "10";           // Valid rate
        
        // Invoke the validateData method with an empty name
        boolean isValid = technicianReportGUI.validateData(location, name, repairCost, rate);
        
        // Assert that validation should fail due to the empty name
        Assert.assertFalse("Validation should fail for empty technician name", isValid);
    }
}