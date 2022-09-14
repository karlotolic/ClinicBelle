package Database;
import Model.Appointment;
import java.util.ArrayList;
/**
 *
 * @author amo
 */
public interface AppointmentDAO {
    
    
    ArrayList<Appointment> read();
        Appointment read(int id);
        void create(Appointment appointment);
        void update(Appointment appointment);   
                void delete(Appointment appointment);
				
    
    
}
