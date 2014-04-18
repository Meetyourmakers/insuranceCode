package healthins;

import java.io.Serializable;

public class Calendar implements Serializable{
    String day;
    String month;
    String description;
    String owner;
    String name;
    public Calendar(String d, String m, String desc, String own, String s){
        day = d;
        month = m;
        description = desc;
        owner = own;
        name = s;
    }
    
    public String getDay(){
        return day;
    }
    
    public String getName(){
        return name;
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
