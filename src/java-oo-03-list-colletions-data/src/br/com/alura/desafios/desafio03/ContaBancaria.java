public class ContaBancaria {
    private int numeroConta;
    private double saldo;

    public ContaBancaria(double saldo, int numeroConta){
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public int getNumeroConta(){
        return numeroConta;
    }
}
