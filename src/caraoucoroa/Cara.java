package caraoucoroa;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Cara extends Thread{
    
    public Moeda m;
    
    public Cara(Moeda m){
        this.m = m;
    }
    
    public void run(){
     while(true){
         
         m.status = "Cara";
         System.out.println(m.status);
         
         try {
             sleep(30);
         } catch (InterruptedException ex) {
             Logger.getLogger(Cara.class.getName()).log(Level.SEVERE, null, ex);
         }
     }   
    }
}
