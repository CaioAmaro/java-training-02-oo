import java.sql.SQLOutput;
import java.util.Scanner;

public class DesafioBancario {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        String nome = "Caio Amaro";
        String tipoConta = "Corrente";
        double saldo = 2500.00;

        System.out.println("**********************************");
        System.out.println("Dados Iniciais do Cliente:");
        System.out.println("");
        System.out.println("Nome:               "+ nome);
        System.out.println("Tipo Conta:         "+ tipoConta);
        System.out.println("Saldo:              R$ "+ saldo);
        System.out.println("**********************************");
        System.out.println("");
        System.out.println("");


        int escolha = 1;

        while(escolha != 4){
            System.out.println("Operações");
            System.out.println("");
            System.out.println("1 -> Consultar Saldo");
            System.out.println("2 -> Depositar");
            System.out.println("3 -> Sacar");
            System.out.println("4 -> Sair");
            System.out.println("");
            System.out.print("Digite a Opção desejada: ");
            escolha = leitura.nextInt();
            while((escolha < 0) || escolha > 4){
                System.out.print("Escolha opção válida: ");
                escolha = leitura.nextInt();
            }

            System.out.println("---------");
            System.out.println("---------");

            switch(escolha){
                case 1:
                    System.out.println("Seu saldo é R$ "+ saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor para depositar: ");
                    double deposito = leitura.nextDouble();
                    saldo += deposito;
                    System.out.println("Operação Feita com Sucesso!");
                    break;
                case 3:
                    System.out.println("Digite o valor para saque.");
                    double saque = leitura.nextDouble();
                    if(saque > saldo){
                        System.out.println("Operação Falhou, saldo insuficiente");
                    }else{
                        System.out.println("Saque feito com Sucesso");
                        saldo -= saque;
                    }
                    break;
                case 4:
                    System.out.println("Você se deslogou.");
                    break;
            }
        }

        System.out.println("");


    }
}
