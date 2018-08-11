
package sincronizacao;

public class caixaEletronicoSaque extends Thread{
    
    float valorSaque;
    ContaCorrente cc;
    
    public caixaEletronicoSaque(ContaCorrente cc, float valorSaque){
        this.valorSaque = valorSaque;
        this.cc = cc;
                
    }
    
    public void run() {
       this.cc.saque(this.valorSaque);
    }
    
}
