package Controller;

import java.util.ArrayList;

import Database.ProcedureConcreteDAO;
import Model.Procedure;

public class ProcedureController {
	 private ProcedureConcreteDAO dao;

	    public ProcedureController() {
	            dao = ProcedureConcreteDAO.getInstance();
	    }

	    public Procedure findPatientByName(String name) {
	            for (Procedure procedure : dao.read()) {
	                    if (procedure.getName().equalsIgnoreCase(name)) {
	                            return procedure;
	                    }
	            }
	            return null;
	    }

	    public void createPatient(Procedure procedure) {
	            dao.create(procedure);
	    }
	    public void Procedure(Procedure procedure) {
	        dao.update(procedure);
	}

	    public void deleteProcedure(Procedure procedure) {
	            dao.delete(procedure);
	    }
	    public void readProcedure(Procedure procedure) {
	        dao.read();
	}
	    public ArrayList<Procedure> getAllProcedures() {
	            return dao.read();
	    }
	   
}
