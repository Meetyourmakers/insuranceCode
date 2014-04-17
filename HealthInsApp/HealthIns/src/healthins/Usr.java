package healthins;
import java.io.Serializable;

public class Usr implements Serializable{
    private String id;
    private String pass;
    
    public Usr(String id, String pass){
        this.id = id;
        this.pass = pass;
    }

    public String getId() {
        return id;
    }

    public String getPass() {
        return pass;
    }
    
    
    public void setPass(String pass) {
        this.pass = pass;
    }
}
