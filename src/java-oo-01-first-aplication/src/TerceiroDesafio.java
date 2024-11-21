import java.sql.SQLOutput;
import java.util.Scanner;

public class TerceiroDesafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite qual número você quer o fatorial: ");
        int fatorial = leitura.nextInt();
        String fatorialString = "";
        int total = 1;

        for (int i=fatorial; i>=1; i--){
            if(i != 1){
                fatorialString += i + ".";
            }else{
                fatorialString += i;
            }

            total *= i;
        }

        System.out.println(fatorial+"! = "+ fatorialString + " = "+ total);

        System.out.println("");
        System.out.println("");

        System.out.print("Digite um número: ");
        double numeroSinal = leitura.nextDouble();
        if(numeroSinal < 0){
            System.out.println("Número Digital é Negativo");
        }else if(numeroSinal > 0){
            System.out.println("Número Digitado é Positivo");
        }else{
            System.out.println("Número é zero (Neutro)");
        }

        System.out.println("");
        System.out.println("");

        System.out.print("Escreva o primeiro Número: ");
        int n1 = leitura.nextInt();
        System.out.print("Escreva o segundo Número: ");
        int n2 = leitura.nextInt();

        if(n1 == n2){
            System.out.println("Os números são iguais");
        }else{
            System.out.println("Os números são diferentes");
            if(n1 > n2){
                System.out.println(n1+" é maior que "+ n2);
            }else{
                System.out.println(n2+ " é maior que "+ n1);
            }
        }

        System.out.println("");
        System.out.println("");

        int opcaoSelecionada;

        System.out.println("Olá bem-vindo");
        System.out.println("*********");
        System.out.println("Calcular área de um Quadrado (1) ");
        System.out.println("Calcular área de um Circulo (2) ");
        System.out.println("*********");
        System.out.print("Escolha as opcão desejada: ");
        opcaoSelecionada = leitura.nextInt();

        if(opcaoSelecionada != 1 && opcaoSelecionada != 2){
            System.out.println("Opção invalida");
        }else if(opcaoSelecionada == 1){
            System.out.println("Você escolheu calcular área de um quadrado.");
            System.out.print("Digite o tamanho dos lados: ");
            double tamanhoLado = leitura.nextDouble();
            double area = tamanhoLado*tamanhoLado;
            System.out.println("Área do quadro é: "+area);
        }else{
            System.out.println("Você escolheu calcular área de um circulo");
            System.out.print("Qual é o tamanho do raio: ");
            double raio = leitura.nextDouble();
            double PI = 3.14;
            double area = PI*(raio*raio);
            System.out.println("Área do circulo é "+ area);
        }

        System.out.println("");
        System.out.println("");

        System.out.print("Digite o número que você gostaria de ver a tabuada: ");
        int tabuada = leitura.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(tabuada+" X "+ i + " = " + tabuada*i);
        }

        System.out.println("");
        System.out.println("");

        System.out.print("Digite o número: ");
        int parOuImpa = leitura.nextInt();

        if(parOuImpa%2==0){
            System.out.println("Número Digitado é par");
        }else{
            System.out.println("Número Digitado é Impa");
        }

    }
}
