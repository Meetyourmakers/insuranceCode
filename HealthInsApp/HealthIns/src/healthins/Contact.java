package healthins;

import java.io.Serializable;

public class Contact implements Serializable{
    String name;
    String lastName;
    String mail;
    String phone;
    String owner;
    
    public Contact(String usr, String last, String email, String tel, String own){
        name = usr;
        mail = email;
        phone = tel;
        owner = own;
        lastName = last;
    }
    
    public String getOwner(){
        return owner;
    }
    
    public String getName(){
        return name;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getMail(){
        return mail;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public void setMail(String m){
        mail = m;
    }
    
    public void setPhone(String p){
        phone = p;
    }
    
    public void setLastName(String l){
        lastName = l;
    }
    
    
}
