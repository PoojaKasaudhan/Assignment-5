import java.sql.*;

public class RetrievePatientInfo {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // Replace with your database connection information
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String username = "your_username";
        String password = "your_password";

        // Connect to the database
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection connection = DriverManager.getConnection(url, username, password);

        // Create a statement
        Statement statement = connection.createStatement();

        // Write your SQL query to retrieve patient information
        String query = "SELECT * FROM patients"; // Replace with specific columns if needed

        // Execute the query and get the results
        ResultSet resultSet = statement.executeQuery(query);

        // Process the results
        while (resultSet.next()) {
            int patientId = resultSet.getInt("patient_id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            String diagnosis = resultSet.getString("diagnosis");

            // Display the retrieved information
            System.out.println("Patient ID: " + patientId);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Diagnosis: " + diagnosis);
            System.out.println("--------------------");
        }

        // Close resources
        resultSet.close();
        statement.close();
        connection.close();
    }
}

