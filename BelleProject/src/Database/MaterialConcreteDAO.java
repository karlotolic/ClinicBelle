package Database;

import Model.Material;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class MaterialConcreteDAO {
      
    
    private static MaterialConcreteDAO instance = new MaterialConcreteDAO();

        public static MaterialConcreteDAO getInstance() {
                return instance;
        }
    
      
   
    public ArrayList<Material> read() {
        ArrayList<Material> materials = new ArrayList<Material>();

                try (Connection con = DatabaseAccess.getConnection()) {
                        Statement statement = con.createStatement();
                        ResultSet rs = statement.executeQuery("SELECT * FROM dbo.Material");
                        while (rs.next()) {
                                
                                String mname = rs.getString("name");
                                double mprice = rs.getDouble("price");
                                String msuplier = rs.getString("supplier");
                                int mstock = rs.getInt("stock");
                                
                              
                                
                                
                                
                                
                                Material material = new Material(mname,mprice,msuplier,mstock);
                                
                                materials.add(material);
                        }

                } catch (SQLException e) {
                        e.printStackTrace();
                }
                return materials;
    }

    
    public Material read(String name) {
        try (Connection con = DatabaseAccess.getConnection()) {
                        Statement statement = con.createStatement();
                        ResultSet rs = statement.executeQuery("SELECT * FROM dbo.Material");
                        while (rs.next()) {
                                
                        	String mname = rs.getString("name");
                            double mprice = rs.getDouble("price");
                            String msuplier = rs.getString("supplier");
                            int mstock = rs.getInt("stock");
                            
                                
                                

                                return new Material(mname,mprice,msuplier,mstock);
                        }
                } catch (SQLException e) {
                        e.printStackTrace();
                }
                return null;
    }

    
    public void create(Material material) {
        try (Connection con = DatabaseAccess.getConnection()) {
                        PreparedStatement ps = con.prepareStatement(
                                        "INSERT INTO dbo.Material (name, price, supplier, stock)"
                                                        + "VALUES (?,?,?,?)");
                        ps.setString(1, material.getName());
                        ps.setDouble(2,material.getPrice());
                        ps.setString(3, material.getSupplier());
                        ps.setInt(4, material.getStock());
                        
                        
                        ps.execute();
                } catch (SQLException e) {
                        e.printStackTrace();
                }
    }

    
    public void update(Material material) {
        try (Connection con = DatabaseAccess.getConnection()) {
                        PreparedStatement ps = con.prepareStatement("USE CSD-CSC-S212_10407570 "
                                        + "UPDATE dbo.Material SET name=?, SET price=?, SET supplier=?, SET stock=?, "
                                        + "WHERE name=?");
                        ps.setString(1, material.getName());
                        ps.setString(2, material.getSupplier());
                        ps.setInt(3, material.getStock());
                        ps.setDouble(4,material.getPrice());
                        
                        
                        ps.execute();
                } catch (SQLException e) {
                        e.printStackTrace();
                }
    }

    
    public void delete(Material material) {
        try (Connection con = DatabaseAccess.getConnection()) {
                        PreparedStatement ps = con
                                        .prepareStatement("USE CSD-CSC-S212_10407540 " + "DELETE FROM dbo.Material WHERE name=?");
                        ps.setString(1, material.getName());
                        ps.execute();
                } catch (SQLException e) {
                        e.printStackTrace();
                }
    }




        
}
