import java.util.ArrayList;
import java.util.List;

class EmployeeCRUD{
    private List<Employee> employeeList = new ArrayList<>();
    // CREATE
    public void addEmployee(Employee emp) {
        employeeList.add(emp);
        System.out.println("Employee added: " + emp);
    }

    // READ
    public void displayAllEmployees() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees to display.");
            return;
        }

        System.out.println("Employee List:");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }

    // UPDATE
    public void updateEmployee(int id, String newName, String newDepartment) {
        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                emp.setName(newName);
                emp.setDepartment(newDepartment);
                System.out.println("Updated Employee: " + emp);
                return;
            }
        }
        System.out.println("Employee with ID " + id + " not found.");
    }

    // DELETE
    public void deleteEmployee(int id) {
        Employee toRemove = null;
        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                toRemove = emp;
                break;
            }
        }

        if (toRemove != null) {
            employeeList.remove(toRemove);
            System.out.println("Deleted Employee with ID: " + id);
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }
}