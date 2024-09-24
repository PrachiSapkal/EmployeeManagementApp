// File: Student.java
import java.io.Serializable;

public class Employee implements Serializable {
    private String employeeID;
    private String name;
    private int age;
    private String department;
    private String designation;

    public Employee(String employeeID, String name, int age, String department, String designation) {
        this.employeeID = employeeID;
        this.name = name;
        this.age = age;
        this.department = department;
        this.designation = designation;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void displayInfo() {
        System.out.println("ID: " + employeeID + " | Name: " + name + " | Age: " + age +
            " | Dept: " + department + " | Designation: " + designation);
    }
}
