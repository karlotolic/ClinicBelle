
package Database;

import Model.Appointment;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class AppointmentConcreteDAO implements AppointmentDAO {

    
    
    private static AppointmentConcreteDAO instance = new AppointmentConcreteDAO();

        public static AppointmentConcreteDAO getInstance() {
                return instance;
        }
    
    
    
    
    
    
    @Override
    public ArrayList<Appointment> read() {
        ArrayList<Appointment> appointments = new ArrayList<Appointment>();

                try (Connection con = DatabaseAccess.getConnection()) {
                        Statement statement = con.createStatement();
                        ResultSet rs = statement.executeQuery("SELECT * FROM dbo.elo");
                        while (rs.next()) {
                                int aid = rs.getInt("h");
                                String name = rs.getString("t");
                                String date = rs.getString("z");
                                
                                Appointment appointment = new Appointment(aid,name,date);
                                
                                appointments.add(appointment);
                        }

                } catch (SQLException e) {
                        e.printStackTrace();
                }
                return appointments;
    }

    public Appointment read(int id) {
        try (Connection con = DatabaseAccess.getConnection()) {
                        Statement statement = con.createStatement();
                        ResultSet rs = statement.executeQuery("select h,t,z from dbo.elo where h=?");
                        while (rs.next()) {
                                int aid = rs.getInt("h");
                                String name = rs.getString("t");
                                String date = rs.getString("z");
                                
                                
                                

                                return new Appointment(aid,name,date);
                        }
                } catch (SQLException e) {
                        e.printStackTrace();
                }
                return null;
    }

    @Override
    public void create(Appointment appointment) {
        try (Connection con = DatabaseAccess.getConnection()) {
          
            PreparedStatement ps = con.prepareStatement(
                                        "INSERT INTO dbo.elo (h,t,z)"
                                                        + "VALUES (?,?,?)");
                        ps.setInt(1, appointment.getAid());
                        ps.setString(2, appointment.getName());
                        ps.setString(3, appointment.getDate());
                        
                        ps.execute();
                } catch (SQLException e) {
                        e.printStackTrace();
                }
    }

    @Override
    public void update(Appointment appointment) {
        try (Connection con = DatabaseAccess.getConnection()) {
                        PreparedStatement ps = con.prepareStatement("update dbo.elo set t=? set z=? where h=?");
                        
                        
                        ps.setString(1, appointment.getName());        	
                        ps.setString(2, appointment.getDate());
                        ps.setInt(3, appointment.getAid());
                   
                        
                        
                     ps.execute();
                } catch (SQLException e) {
                        e.printStackTrace();
                }
    }

    @Override
    public void delete(Appointment appointment) {
        try (Connection con = DatabaseAccess.getConnection()) {
                        PreparedStatement ps = con
                                        .prepareStatement("delete from dbo.elo WHERE h=?");
                        ps.setInt(1, appointment.getAid());
                        ps.execute();
                } catch (SQLException e) {
                        e.printStackTrace();
                }
    }
    
    
    
    
}
