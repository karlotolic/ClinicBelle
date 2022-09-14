package Database;

import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Model.Patient;

public class PatientConcreteDAO {
      
    
    
    private static PatientConcreteDAO instance = new PatientConcreteDAO();

        public static PatientConcreteDAO getInstance() {
                return instance;
        }



public ArrayList<Patient> read() {
        ArrayList<Patient> patients = new ArrayList<Patient>();

                try (Connection con = DatabaseAccess.getConnection()) {
                        Statement statement = con.createStatement();
                        ResultSet rs = statement.executeQuery("SELECT * FROM dbo.Patient");
                        while (rs.next()) {
                                
                                int cpr = rs.getInt("cpr");
                                String name = rs.getString("name");
                                String surname = rs.getString("surname");
          
                                String sex = rs.getString("sex");
                                String phone = rs.getString("phone");
                                  String address = rs.getString("address");
                                   String city = rs.getString("city");
                                    String areaCode = rs.getString("areaCode");
                                    
                                     String status = rs.getString("status");
                                      boolean hepatitis = rs.getBoolean("hepatitis");
                                      boolean aids = rs.getBoolean("aids");
                                      boolean herpes = rs.getBoolean("herpes");
                                      boolean heart = rs.getBoolean("heart");
                                      boolean diabetes = rs.getBoolean("diabetes");
                                      boolean allergies = rs.getBoolean("allergies");
                                      
                                    
                                
                                
                                
                                Patient patient = new Patient(cpr,name,surname,sex,phone,address,city,areaCode,status,hepatitis,aids,herpes,heart,diabetes,allergies);
                                
                                patients.add(patient);
                        }

                } catch (SQLException e) {
                        e.printStackTrace();
                }
                return patients;
    }

    
    public Patient read(String name) {
        try (Connection con = DatabaseAccess.getConnection()) {
                        Statement statement = con.createStatement();
                        ResultSet rs = statement.executeQuery("SELECT * FROM dbo.Patient");
                        while (rs.next()) {
                                
                        	 
                            int cpr = rs.getInt("cpr");
                            String pname = rs.getString("name");
                            String surname = rs.getString("surname");
      
                            String sex = rs.getString("sex");
                            String phone = rs.getString("phone");
                              String address = rs.getString("address");
                               String city = rs.getString("city");
                                String areaCode = rs.getString("areaCode");
                                
                                 String status = rs.getString("status");
                                  boolean hepatitis = rs.getBoolean("hepatitis");
                                  boolean aids = rs.getBoolean("aids");
                                  boolean herpes = rs.getBoolean("herpes");
                                  boolean heart = rs.getBoolean("heart");
                                  boolean diabetes = rs.getBoolean("diabetes");
                                  boolean allergies = rs.getBoolean("allergies");
                                
                                

                                return new Patient(cpr,pname,surname,sex,phone,address,city,areaCode,status,hepatitis,aids,herpes,heart,diabetes,allergies);
                        }
                } catch (SQLException e) {
                        e.printStackTrace();
                }
                return null;
    }

    
    public void create(Patient patient) {
        try (Connection con = DatabaseAccess.getConnection()) {
                        PreparedStatement ps = con.prepareStatement(
                                        "INSERT INTO dbo.Patient (cpr,name,surname,sex,phone,address,city,areaCode,status,hepatitis,aids,herpes,heart,diabetes,allergies)"
                                                        + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                        ps.setInt(1, patient.getCpr());
                        ps.setString(2, patient.getName());
                        ps.setString(3, patient.getSurname());
                        ps.setString(4, patient.getSex());
                        ps.setString(5,patient.getPhone());
                        ps.setString(6,patient.getAddress());
                        ps.setString(7,patient.getCity());
                        ps.setString(8,patient.getAreaCode());
                        ps.setString(9,patient.getStatus());
                        ps.setBoolean(10,patient.isHepatitis());
                        ps.setBoolean(11,patient.isAids());
                        ps.setBoolean(12,patient.isHerpes());
                        ps.setBoolean(13,patient.isHeart());
                        ps.setBoolean(14,patient.isDiabetes());
                        ps.setBoolean(15,patient.isAllergie());
                        
                      
                       
                              
                        ps.execute();
                } catch (SQLException e) {
                        e.printStackTrace();
                }
    }

    
    public void update(Patient patient) {
        try (Connection con = DatabaseAccess.getConnection()) {
                        PreparedStatement ps = con.prepareStatement("USE CSD-CSC-S212_10407540 "
                                        + "UPDATE dbo.Patient SET cpr=?, SET name=?, SET surname=?, SET sex=?, "
                                        + "SET phone=?, SET address=?, SET city=?,SET areaCode=?, SET status=?, SET hepatitis=?,SET aids=?, SET herpes=?, SET heart=?,SET diabetes=?, SET allergies=?, SET city=?" + "WHERE id=?");
                        ps.setInt(1, patient.getCpr());
                        ps.setString(2, patient.getName());
                        ps.setString(3, patient.getSurname());
                        ps.setString(4, patient.getSex());
                        ps.setString(5,patient.getPhone());
                        ps.setString(6,patient.getAddress());
                        ps.setString(7,patient.getCity());
                        ps.setString(8,patient.getAreaCode());
                        ps.setString(9,patient.getStatus());
                        ps.setBoolean(10,patient.isHepatitis());
                        ps.setBoolean(11,patient.isAids());
                        ps.setBoolean(12,patient.isHerpes());
                        ps.setBoolean(13,patient.isHeart());
                        ps.setBoolean(14,patient.isDiabetes());
                        ps.setBoolean(15,patient.isAllergie());
                        
                        
                        ps.execute();
                } catch (SQLException e) {
                        e.printStackTrace();
                }
    }

    
    public void delete(Patient patient) {
        try (Connection con = DatabaseAccess.getConnection()) {
                        PreparedStatement ps = con.prepareStatement("USE CSD-CSC-S212_10407540 " + "DELETE FROM dbo.Patient WHERE name=?");
                        ps.setString(1, patient.getName());
                        ps.execute();
                } catch (SQLException e) {
                        e.printStackTrace();
                }
    }



}
