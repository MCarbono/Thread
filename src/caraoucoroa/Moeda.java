
package caraoucoroa;

import java.util.Scanner;

public class Moeda {
    
    public String status;
    
    public static void main(String ... args){
        Scanner scan = new Scanner(System.in);
        Moeda m = new Moeda();
        Cara cara = new Cara(m);
        Coroa coroa = new Coroa(m);
       
        System.out.println("Cara ou Coroa?");
        String escolhaUsuario = scan.nextLine();
        
        cara.start();
        coroa.start();
        
        System.out.println("Digite enter para parar as threads.");
        String enter = scan.nextLine();
        if(enter != null){
            cara.stop();
            coroa.stop();
        }
        
        if(escolhaUsuario.equals(m.status))
            System.out.println("Massa, você acertou.");
         else 
            System.out.println("Errou. tente outra vez.");  
        
    }
}
