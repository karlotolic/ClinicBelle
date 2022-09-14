package Database;

import java.util.ArrayList;

import Model.Material;

public interface MaterialDAO {
	
	 ArrayList<Material> read();
	 Material read(int id);
     void create(Material material);
     void update(Material material);   
             void delete(Material material);
				
 

}
