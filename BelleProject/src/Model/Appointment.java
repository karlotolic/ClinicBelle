package Model;
import java.util.ArrayList;

public class Appointment {
    private int aid;
    private String date;
    private String name;
    
     
    public Appointment(int aid, String date, String name) {
        this.aid = aid;
        this.date = date;
        this.name = name;
       
    }

    public int getAid() {
        return aid;
    }

    public void setId(int aid) {
        this.aid = aid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  
    
    
        
   
}
