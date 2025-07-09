package CRUD_JDBC.src;
import java.sql.*;

public class EmployeeJDBC {

    private static final String USER = "root";    // your MySQL username
    private static final String URL = "jdbc:mysql://localhost:3306/company";
    private static final String PASSWORD = "Debsaha909@"; // your MySQL password

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load MySQL driver
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // CREATE
    public void addEmployee(Employee emp) throws SQLException {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO employees VALUES (?, ?, ?)")) {

            stmt.setInt(1, emp.getId());
            stmt.setString(2, emp.getName());
            stmt.setString(3, emp.getDepartment());

            stmt.executeUpdate();
            System.out.println("Employee added successfully.");
        }
    }

    // READ
    public void displayAllEmployees() throws SQLException {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM employees")) {

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Department: " + rs.getString("department"));
            }
        }
    }

    // UPDATE
    public void updateEmployee(int id, String newName, String newDepartment) throws SQLException {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("UPDATE employees SET name = ?, department = ? WHERE id = ?")) {

            stmt.setString(1, newName);
            stmt.setString(2, newDepartment);
            stmt.setInt(3, id);

            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Employee updated successfully.");
            } else {
                System.out.println("Employee not found.");
            }
        }
    }

    // DELETE
    public void deleteEmployee(int id) throws SQLException {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM employees WHERE id = ?")) {

            stmt.setInt(1, id);

            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Employee deleted successfully.");
            } else {
                System.out.println("Employee not found.");
            }
        }
    }
}
