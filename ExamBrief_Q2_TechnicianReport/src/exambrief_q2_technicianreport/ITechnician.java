/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package exambrief_q2_technicianreport;

/**
 *
 * @author FS
 */
public interface ITechnician {
    double calculatePay(String repairCostStr, String rateStr);
    boolean validateData(String location, String name, String repairCostStr, String rateStr);
}