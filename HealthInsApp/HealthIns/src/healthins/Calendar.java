package healthins;

import java.io.Serializable;

public class Calendar implements Serializable{
    String day;
    String month;
    String description;
    String owner;
    public Calendar(String d, String m, String desc, String own){
        day = d;
        month = m;
        description = desc;
        owner = own;
    }
    
    public String getDay(){
        return day;
    }
    
    public String getMonth(){
        return month;
    }
    
    public String getDescription(){
        return description;
    }
    
    public String getOwner(){
        return owner;
    }
    
    public void setDescription(String d){
        description = d;
    }
    
}
