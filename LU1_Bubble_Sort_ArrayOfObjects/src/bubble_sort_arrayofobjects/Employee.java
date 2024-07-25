
package bubble_sort_arrayofobjects;

class Employee {
    private int empNum;
    private String lastName;
    private String firstName;
    private double salary;

    public Employee(int empNum, String lastName, String firstName, double salary) {
        this.empNum = empNum;
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
    }

    public int getEmpNum() {
        return empNum;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNum=" + empNum +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", salary=" + salary +
                '}';
    }
}