package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DatabaseAccess {
 private static Connection connection = null; // the connection to the database  
        
        
        //The values of the constants should be read from a configuration file, etc.
        //You need to change the constants to the connection properties of your DB
        private static final String DBNAME = "CSC-CSD-S212_10407540";
        private static final String SERVERNAME = "hildur.ucn.dk";
        private static final String PORTNUMBER = "1433";
        private static final String USERNAME = "CSC-CSD-S212_10407540";
        private static final String PASSWORD = "Password1!"; 

        // constructor - private because of singleton pattern
        
                

        
        

		public static Connection getConnection() {
			String urlString = String.format("jdbc:sqlserver://%s:%s;databaseName=%s;encrypt=false", SERVERNAME, PORTNUMBER, DBNAME);               

            
            try {
                    connection = DriverManager.getConnection(urlString, USERNAME,  PASSWORD);
            } catch (SQLException e) {
                    e.printStackTrace();
            }


            return connection;
		}
        
    
    
    
}
