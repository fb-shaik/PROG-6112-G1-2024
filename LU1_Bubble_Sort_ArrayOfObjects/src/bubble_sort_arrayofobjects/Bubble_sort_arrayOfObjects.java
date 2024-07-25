/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubble_sort_arrayofobjects;

/**
 *
 * @author lab_services_student
 */
public class Bubble_sort_arrayOfObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Creating an array of Employee objects
        Employee[] employees = new Employee[5];
        employees[0] = new Employee(101, "Smith", "John", 50000.00);
        employees[1] = new Employee(102, "Doe", "Jane", 75000.00);
        employees[2] = new Employee(103, "Brown", "Chris", 45000.00);
        employees[3] = new Employee(104, "Jones", "Mary", 60000.00);
        employees[4] = new Employee(105, "White", "Alice", 55000.00);

        // Displaying original list of employees
        System.out.println("Original list of employees:");
        displayEmployees(employees);

        // Sorting the employees by salary using bubble sort
        bubbleSort(employees);

        // Displaying sorted list of employees
        System.out.println("\nSorted list of employees by salary:");
        displayEmployees(employees);
    }
    
    public static void bubbleSort(Employee[] array)
{
int a, b;
Employee temp;
int highSubscript = array.length - 1;
for(a = 0; a < highSubscript; ++a)
for(b = 0; b < highSubscript; ++b)
if(array[b].getSalary() > array[b + 1].getSalary())
{
temp = array[b];
array[b] = array[b + 1];
array[b + 1] = temp;
}
}
    
     public static void displayEmployees(Employee[] employees) {
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
