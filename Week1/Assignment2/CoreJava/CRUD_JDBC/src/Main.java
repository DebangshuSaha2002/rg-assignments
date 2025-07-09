package CRUD_JDBC.src;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        EmployeeJDBC crud = new EmployeeJDBC();
        try {
            crud.addEmployee(new Employee(1, "Alice", "HR"));
            crud.addEmployee(new Employee(2, "Bob", "IT"));

            System.out.println("All Employees:");
            crud.displayAllEmployees();

            crud.updateEmployee(2, "Robert", "Engineering");

            crud.deleteEmployee(1);

            System.out.println("After Update and Delete:");
            crud.displayAllEmployees();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
