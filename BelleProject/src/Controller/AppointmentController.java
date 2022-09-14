package Controller;
import Model.Appointment;
import java.util.ArrayList;
import Model.Appointment;
import Database.AppointmentConcreteDAO;


public class AppointmentController {
    
        private AppointmentConcreteDAO dao;

        public AppointmentController() {
                dao = AppointmentConcreteDAO.getInstance();
        }

        public Appointment findAppointmentByName(String name) {
                for (Appointment appointment : dao.read()) {
                        if (appointment.getName().equalsIgnoreCase(name)) {
                                return appointment;
                        }
                }
                return null;
        }

        public void createAppointment(Appointment appointment) {
                dao.create(appointment);
        }
        public void updateAppointment(Appointment appointment) {
            dao.update(appointment);
    }

        public void deleteAppointment(Appointment appointment) {
                dao.delete(appointment);
        }
        public void readAppointment(Appointment appointment) {
            dao.read();
    }
        public ArrayList<Appointment> getAllAppointments() {
                return dao.read();
        }
       
}
