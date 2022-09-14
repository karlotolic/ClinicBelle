package Controller;

import java.util.ArrayList;

import Database.MaterialConcreteDAO;
import Model.Material;

public class MaterialController {

    private MaterialConcreteDAO dao;

    public MaterialController() {
            dao = MaterialConcreteDAO.getInstance();
    }

    public Material findAppointmentByName(String name) {
            for (Material material : dao.read()) {
                    if (material.getName().equalsIgnoreCase(name)) {
                            return material;
                    }
            }
            return null;
    }

    public void createMaterial(Material material) {
            dao.create(material);
    }
    public void updateMaterial(Material material) {
        dao.update(material);
}

    public void deleteMaterial(Material material) {
            dao.delete(material);
    }
    public void readMaterial(Material material) {
        dao.read();
}
    public ArrayList<Material> getAllMaterials() {
            return dao.read();
    }
   
}
