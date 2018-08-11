package caraoucoroa;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Coroa extends Thread{
    
    public Moeda m;
    
    public Coroa(Moeda m){
        this.m = m;
    }
    
    public void run(){
        
        while(true){
            
            m.status = "Coroa";
            System.out.println(m.status);
            
            try {
                sleep(30);
            } catch (InterruptedException ex) {
                Logger.getLogger(Coroa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
