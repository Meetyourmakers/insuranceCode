package healthins;
import java.util.*;
import java.io.*;

public class HealthIns {
    static Usr currentUsr;

    public static Boolean saveUsers(ArrayList <Usr> users){
        try {
            FileOutputStream fos = new FileOutputStream("usrList");
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(users);
            }
        }
        catch(IOException ex) {
            return false;
        }
        return true; 
    }
    
    public static Boolean saveContactList(ArrayList <Contact> contacts){
        try {
            FileOutputStream fos = new FileOutputStream("contactList");
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(contacts);
            }
        }
        catch(IOException ex) {
            return false;
        }
        return true; 
    }
    
    public static ArrayList<Usr> readUsers(ArrayList <Usr> users){
        try{
            InputStream file = new FileInputStream("usrList");
            InputStream buffer = new BufferedInputStream(file);
            File f = new File("usrList");
            if(f.length()!=0){
                try(ObjectInput input = new ObjectInputStream (buffer)) {
                    ArrayList<Usr> recoveredUsers = (ArrayList<Usr>)input.readObject();
                    for(Usr u: recoveredUsers)
                       users.add(new Usr(u.getId(), u.getPass()));
                }
            }
        }
        catch(ClassNotFoundException | IOException ex){
            return null;
        }
        return users;
    }
    
    public static void setCurrentUsr(Usr u){
        currentUsr = u;
    }
    
    public static ArrayList<Contact> readContactList(ArrayList <Contact> contacts){
        try{
            InputStream file = new FileInputStream("contactList");
            InputStream buffer = new BufferedInputStream(file);
            File f = new File("contactList");
            if(f.length()!=0){
                try(ObjectInput input = new ObjectInputStream (buffer)) {
                    ArrayList<Contact> recoveredUsers = (ArrayList<Contact>)input.readObject();
                    for(Contact c: recoveredUsers)
                       contacts.add(new Contact(c.getName(), c.getLastName(), c.getMail(), c.getPhone(), c.getOwner()));
                }
            }
        }
        catch(ClassNotFoundException | IOException ex){
            return null;
        }
        return contacts;
    }
    

    public static void main(String[] args) {
        ArrayList <Usr> users = new ArrayList();
        users = readUsers(users);
        try{
		Login frame = new Login(users);
		frame.setSize(400,400);
		frame.setVisible(true);
	}
	catch(Exception e){	
	}
    }
    
}
