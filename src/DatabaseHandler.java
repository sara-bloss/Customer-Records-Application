import java.sql.*;

public class DatabaseHandler {
	
	Connection connection;
	
	
	//open a connection to database
	public void openConnection() {	
		try {
			this.connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/customer_information",
				"root", "lorem");	
		} 
		
		catch (SQLException e) {
			System.out.print("Error with connection");
		}
		
	}
	
	
	//print a list of the current tables
	public void showTables() {
		try {
			Statement showTables = connection.createStatement();
			ResultSet rs = showTables.executeQuery("Show tables");
			System.out.print("Current tables are: ");
			while(rs.next()) {
				System.out.print(rs.getString(1));
			}
		}
		
		catch (SQLException e) {
			System.out.print("There was an issue loading the tables.");
		}
	}
	
	

	
	
}
