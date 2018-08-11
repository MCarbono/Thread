package sincronizacao;



public class ContaCorrente {

    private float saldo;

    
    ContaCorrente(float s){
        this.saldo = s;

    }
    
    public synchronized void depositar(float valor){
        System.out.println("Depositando: "+valor);
        
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
        }
        
        this.saldo+=valor;
        System.out.println("Depósito de "+valor+" efetuado com sucesso...");
        System.out.println("Saldo na conta: " + this.saldoAtual());
        System.out.println("------------------------------------");
        
    }
    
    
    public float saldoAtual(){
        return this.saldo;
    }
    
    public synchronized boolean saque(float valorSaque){
        
        if(valorSaque > saldo){
            System.out.println("Não é possivel realizar saque pois não há saldo suficiente.");
            return false;
        }
        
        saldo -= valorSaque;
        System.out.println("Saque realizado com sucesso.");
        System.out.println("valor em conta: " + this.saldo);
       
        return true;
    }
    
}
