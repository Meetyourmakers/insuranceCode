package healthins;
import java.util.*;
import java.io.*;

public class HealthIns {
    
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

    public static void main(String[] args) {
        ArrayList <Usr> users = new ArrayList();
        users = readUsers(users);
        try{
		Login frame=new Login(users);
		frame.setSize(400,400);
		frame.setVisible(true);
	}
	catch(Exception e){	
	}
    }
    
}
