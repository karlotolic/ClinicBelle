package Database;

import java.util.ArrayList;

import Model.Patient;

public interface PatientDAO {
	 ArrayList<Patient> read();
	 Patient read(int id);
     void create(Patient patient);
     void update(Patient patient);   
             void delete(Patient patient);
			
}
