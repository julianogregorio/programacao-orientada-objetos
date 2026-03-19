public class ContaBancaria {

    private double saldo;

    public ContaBancaria(double saldo){
        this.saldo = saldo;
    }

    /* 
    public void depositar(double valor){
        saldo += valor;
    }
    

    public void sacar(double valor){
        saldo -= valor;
    }
    */

    public void depositar(double valor){
        if (valor>0){
            saldo += valor;
        }else{
            System.out.println("Valor de depósito inválido. O valor deve ser positivo.");
        }

    }
    
    public void sacar(double valor){
        if (valor > 0 &&  valor <= saldo){
            saldo -= valor;
        }else if (valor <=0){
            System.out.println("Valor inválido");
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public double getSaldo(){
        return saldo;
    }

}