import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteUserUsingStatement {

    public static void main(String[] args) {
        // Database URL, username, password
        String url = "jdbc:mysql://localhost:3306/anudip";
        String user = "root";
        String password = "Yashsql@1";  // Replace with your password

        try {
            // Load MySQL JDBC Driver (optional for newer versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection conn = DriverManager.getConnection(url, user, password);

            // Create a statement
            Statement stmt = conn.createStatement();

            // Delete user with id = 1 (change as needed)
            String sql = "DELETE FROM users WHERE id = 1";

            int rowsAffected = stmt.executeUpdate(sql);

            System.out.println("Rows deleted: " + rowsAffected);

            // Close connection
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}




// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.PreparedStatement;

// public class DeleteUserUsingPreparedStatement {

//     public static void main(String[] args) {
//         String url = "jdbc:mysql://localhost:3306/anudip";
//         String user = "root";
//         String password = "Yashsql@1";  // Replace with your password

//         try {
//             Class.forName("com.mysql.cj.jdbc.Driver");
//             Connection conn = DriverManager.getConnection(url, user, password);

//             // Prepared statement with parameter
//             String sql = "DELETE FROM users WHERE id = ?";
//             PreparedStatement pstmt = conn.prepareStatement(sql);

//             // Set id to delete
//             pstmt.setInt(1, 2);  // Change id as needed

//             int rowsAffected = pstmt.executeUpdate();

//             System.out.println("Rows deleted: " + rowsAffected);

//             pstmt.close();
//             conn.close();
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }
