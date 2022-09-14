package Test;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

import com.microsoft.sqlserver.jdbc.SQLServerException;

import Database.DatabaseAccess;

public class ConnectionTest {

	@Test
	public void connectionTest() throws SQLServerException {
		Connection con;
		con = DatabaseAccess.getConnection();
		assertNotNull(con);
	}
}
