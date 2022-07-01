import java.sql.*;

public class main {

	public static void main(String[] args) {
		
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/customer_information",
				"root", "lorem");
			System.out.print("Connection successful!" + '\n');
			Statement showTables = connection.createStatement();
			ResultSet rs = showTables.executeQuery("Show tables");
			System.out.print("Current tables are: ");
			while(rs.next()) {
				System.out.print(rs.getString(1));
			}
			
			
		} catch (SQLException e) {
			System.out.print("Error with connection");
		}
		
		
	}

}
