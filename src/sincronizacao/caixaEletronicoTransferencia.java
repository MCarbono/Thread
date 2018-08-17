package sincronizacao;

public class caixaEletronicoTransferencia extends Thread{
    
    public float valorTransferencia;
    ContaCorrente cc1;
    ContaCorrente cc2;
    
    public caixaEletronicoTransferencia(ContaCorrente cc1, ContaCorrente cc2, float valorTransferencia){
        this.cc1 = cc1;
        this.cc2 = cc2;
        this.valorTransferencia = valorTransferencia;
    }
    
    public void run(){
        this.cc1.transferencia(cc1, cc2, valorTransferencia);
    }
}
