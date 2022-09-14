package Controller;

import java.util.ArrayList;

import Database.PatientConcreteDAO;
import Model.Patient;

public class PatientController {
	 private PatientConcreteDAO dao;

	    public PatientController() {
	            dao = PatientConcreteDAO.getInstance();
	    }

	    public Patient findPatientByName(String name) {
	            for (Patient patient : dao.read()) {
	                    if (patient.getName().equalsIgnoreCase(name)) {
	                            return patient;
	                    }
	            }
	            return null;
	    }

	    public void createPatient(Patient patient) {
	            dao.create(patient);
	    }
	    public void updatePatient(Patient patient) {
	        dao.update(patient);
	}

	    public void deletePatient(Patient patient) {
	            dao.delete(patient);
	    }
	    public void readPatient(Patient patient) {
	        dao.read();
	}
	    public ArrayList<Patient> getAllMaterials() {
	            return dao.read();
	    }
	   
}
