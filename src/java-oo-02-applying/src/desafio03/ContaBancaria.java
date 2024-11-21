public class ContaBancaria {
    private double saldo;

    void descontarTributos(double valor){
        saldo -= valor;
    }

    void depositar(double valor){
        saldo += valor;
    }

    void sacar(double valor){
        saldo -= valor;
    }

    void consultarSaldo(){
        System.out.println("Saldo: R$ "+saldo);
    }
}
