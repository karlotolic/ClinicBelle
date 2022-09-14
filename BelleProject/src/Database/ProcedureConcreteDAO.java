package Database;

import Model.Procedure;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author amo
 */
public class ProcedureConcreteDAO {
      private static ProcedureConcreteDAO instance = new ProcedureConcreteDAO();

        public static ProcedureConcreteDAO getInstance() {
                return instance;
        }
    

public ArrayList<Procedure> read() {
        ArrayList<Procedure> procedures = new ArrayList<Procedure>();

                try (Connection con = DatabaseAccess.getConnection()) {
                        Statement statement = con.createStatement();
                        ResultSet rs = statement.executeQuery("SELECT * FROM dbo.Procedure");
                        while (rs.next()) {
                                
                                int id = rs.getInt("id");
                                String name = rs.getString("name");
                                String price = rs.getString("price");
                                int x = rs.getInt("x");
                                
                                      
                                    
                                
                                
                                
                                Procedure procedure = new Procedure(id,name,price,x);
                                
                                procedures.add(procedure);
                        }

                } catch (SQLException e) {
                        e.printStackTrace();
                }
                return procedures;
    }

    
    public Procedure read(String name) {
        try (Connection con = DatabaseAccess.getConnection()) {
                        Statement statement = con.createStatement();
                        ResultSet rs = statement.executeQuery("SELECT * FROM dbo.Procedure");
                        while (rs.next()) {
                                
                        	int id = rs.getInt("id");
                            String pname = rs.getString("name");
                            String price = rs.getString("price");
                            int x = rs.getInt("x");
                              
                                

                                return new Procedure(id,pname,price,x);
                        }
                } catch (SQLException e) {
                        e.printStackTrace();
                }
                return null;
    }

    
    public void create(Procedure procedure) {
        try (Connection con = DatabaseAccess.getConnection()) {
                        PreparedStatement ps = con.prepareStatement(
                                        "INSERT INTO dbo.appointment (name, purchasePrice, salesPrice, rentPrice, countryOfOrigin, minStock, stock)"
                                                        + "VALUES (?,?,?,?,?,?,?)");
                        ps.setInt(1, procedure.getId());
                        ps.setString(2, procedure.getName());
                        ps.setString(3, procedure.getPrice());
                        ps.setInt(4,procedure.getX());
                        
                        ps.execute();
                } catch (SQLException e) {
                        e.printStackTrace();
                }
    }

    
    public void update(Procedure procedure) {
        try (Connection con = DatabaseAccess.getConnection()) {
                        PreparedStatement ps = con.prepareStatement("USE CSD-CSC-S212_10407540 "
                                        + "UPDATE dbo.Procedure SET id=?, SET name=?, SET price=?, SET x=?, "
                                        + "WHERE id=?");
                        ps.setInt(1, procedure.getId());
                        ps.setString(2, procedure.getName());
                        ps.setString(3, procedure.getPrice());
                        ps.setInt(4,procedure.getX());
                        
                        
                        ps.execute();
                } catch (SQLException e) {
                        e.printStackTrace();
                }
    }

    
    public void delete(Procedure procedure) {
        try (Connection con = DatabaseAccess.getConnection()) {
                        PreparedStatement ps = con.prepareStatement("USE CSD-CSC-S212_10407540 " + "DELETE FROM dbo.Procedure WHERE name=?");
                        ps.setString(1, procedure.getName());
                        ps.execute();
                } catch (SQLException e) {
                        e.printStackTrace();
                }
    }



    
}
