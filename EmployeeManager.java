// File: StudentManager.java
import java.util.ArrayList;

public class EmployeeManager {
    private ArrayList<Employee> employeeList;

    public EmployeeManager() {
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
        System.out.println("Employee added.");
    }

    public void updateEmployee(String employeeID, String newName, int newAge, String newDepartment, String newDesignation) {
        for (Employee employee : employeeList) {
            if (employee.getEmployeeID().equals(employeeID)) {
                employee.setName(newName);
                employee.setAge(newAge);
                employee.setDepartment(newDepartment);
                employee.setDesignation(newDesignation);
                System.out.println("Employee updated.");
            }
        }
    }

    public void deleteEmployee(String employeeID) {
        employeeList.removeIf(employee -> employee.getEmployeeID().equals(employeeID));
        System.out.println("Employee deleted.");
    }

    public void viewStudent(String employeeID) {
        for (Employee employee : employeeList) {
            if (employee.getEmployeeID().equals(employeeID)) {
                employee.displayInfo();
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
}

