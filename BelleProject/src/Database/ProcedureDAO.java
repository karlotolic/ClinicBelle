package Database;

import java.util.ArrayList;

import Model.Procedure;

public interface ProcedureDAO {
	ArrayList<Procedure> read();
	Procedure read(int id);
    void create(Procedure procedure);
    void update(Procedure procedure);   
            void delete(Procedure procedure);
}
