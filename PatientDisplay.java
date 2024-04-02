import java.sql.*;

public class PatientDisplay {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:oracle:thin:@localhost:1521:XE"; 
        String username = "your_username"; 
        String password = "your_password"; 

        Class.forName("oracle.jdbc.driver.OracleDriver");

        Connection connection = DriverManager.getConnection(url, username, password);

        Statement statement = connection.createStatement();

        String query = "SELECT patient_id, name, problem, bill FROM patients";

        ResultSet resultSet = statement.executeQuery(query);

        System.out.println("Patient ID\t Name\t\t  Problem\t\t Bill");
        System.out.println("---------------------------------------------------------");
        while (resultSet.next()) {
            int patientId = resultSet.getInt("patient_id");
            String name = resultSet.getString("name");
            String problem = resultSet.getString("problem");
            double bill = resultSet.getDouble("bill");

            System.out.format("%d\t\t %-20s\t %-20s\t  %.2f\n", patientId, name, problem, bill);
        }

        resultSet.close();
        statement.close();
        connection.close();
    }
}
