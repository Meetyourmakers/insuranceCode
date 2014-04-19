package healthins;
import java.io.Serializable;

public class History implements Serializable{
    String owner;
    String hist;
    
    public History(String o, String h){
        owner = o;
        hist = h;
    }
    
    public String getOwner(){
        return owner;
    }
    
    public String getHist(){
        return hist;
    }
    
    public void setHist(String h){
        hist = h;
    }
    
}
