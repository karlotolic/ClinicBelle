package Test;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

	
	public class Program {
		private static Connection connection = null;
		// The values of the constants should be read from a configuration file, etc.
		// You need to change the constants to the connection properties of your DB
		private static final String DBNAME = "CSC-CSD-S212_10407540";
        private static final String SERVERNAME = "hildur.ucn.dk";
        private static final String PORTNUMBER = "1433";
        private static final String USERNAME = "CSC-CSD-S212_10407540";
        private static final String PASSWORD = "Password1!"; 
		

			/*
			 * format URL
			 * https://docs.microsoft.com/en-us/sql/connect/jdbc/building-the-connection-url
			 * ?view=sql-server-ver15
			 */

//			String urlString = String.format("jdbc:sqlserver://%s:%s;databaseName=%s;encrypt=false", SERVERNAME, PORTNUMBER, DBNAME);

			public static Connection getConnection() {
				String urlString = String.format("jdbc:sqlserver://%s:%s;databaseName=%s;encrypt=false", SERVERNAME, PORTNUMBER, DBNAME);               

			
	            try {
	                    connection = DriverManager.getConnection(urlString, USERNAME,  PASSWORD);
	            } catch (SQLException e) {
	                    e.printStackTrace();
	            }


	            return connection;
			}

		public void connectAndGetMetadata(String urlString, String username, String password) {

			try (Connection connection = DriverManager.getConnection(urlString, username, password)) {
				DatabaseMetaData metadata = connection.getMetaData();
				printMetaData(metadata);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		private void printMetaData(DatabaseMetaData metadata) throws SQLException {
			System.out.println("Database Product Name: " + metadata.getDatabaseProductName());
			System.out.println("Database Product Version: " + metadata.getDatabaseProductVersion());
			System.out.println("Logged User: " + metadata.getUserName());
			System.out.println("JDBC Driver: " + metadata.getDriverName());
			System.out.println("Driver Version: " + metadata.getDriverVersion());
			System.out.println("\n");
		}

	}
}
