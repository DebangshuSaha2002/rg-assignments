public class Main {
    public static void main(String[] args) {
        EmployeeCRUD crud = new EmployeeCRUD();

        // Add employees
        crud.addEmployee(new Employee(1, "Alice", "HR"));
        crud.addEmployee(new Employee(2, "Bob", "IT"));
        crud.addEmployee(new Employee(3, "Charlie", "Finance"));

        // Display all employees
        crud.displayAllEmployees();

        // Update employee
        crud.updateEmployee(2, "Bob Smith", "Engineering");

        // Delete employee
        crud.deleteEmployee(3);

        // Display after update & delete
        crud.displayAllEmployees();
    }
}