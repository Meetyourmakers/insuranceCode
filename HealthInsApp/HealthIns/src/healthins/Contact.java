package healthins;

import java.io.Serializable;

public class Contact implements Serializable{
    String name;
    String mail;
    String phone;
    String owner;
    
    public Contact(String usr, String email, String tel, String own){
        name = usr;
        mail = email;
        phone = tel;
        owner = own;
    }
    
    public String getOwner(){
        return owner;
    }
    
    public String getName(){
        return name;
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
    
}
