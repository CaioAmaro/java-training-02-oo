import java.util.Scanner;

public class CartaoCredito {
    private double limite;
    private double limiteMaximo; // Limite max tem que ser no minimo igual a 1;

    public CartaoCredito(double limiteMaximo){
        if(limiteMaximo<=0){
            limiteMaximo = 1;
        }
        this.limiteMaximo = limiteMaximo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite() {
        Scanner ler = new Scanner(System.in);
        double limite;

        System.out.println();
        System.out.println("*********** Definição de limite de crédito ***********");
        System.out.println();
        System.out.println("Regras: Escolha um limite entre (R$1,00 à R$ "+this.getLimiteMaximo()+")");
        System.out.println();
        System.out.println("Digite o limite de crédito desejado: ");
        System.out.print("R$");
        limite = ler.nextDouble();

        while(limite<=0 || limite>this.getLimiteMaximo()){
            System.out.println();
            System.out.println("Erro: Digite um valor válido");
            System.out.println("Escolha um limite entre (R$1,00 à R$ "+this.getLimiteMaximo()+")");
            System.out.print("R$");
            limite = ler.nextDouble();
        }

        this.limite = limite;
        System.out.println();
        System.out.println(":: Limite de crédito definido com sucesso! ::");
        System.out.println();
    }

    public double getLimiteMaximo() {
        return limiteMaximo;
    }

    public void efetuarCompra(double valor){
        this.limite -= valor;
    }

}
