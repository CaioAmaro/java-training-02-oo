/*
 * Crie um programa simples que solicita dois números ao usuário e realiza a divisão do primeiro pelo segundo.
 *  Utilize o bloco try/catch para tratar a exceção que pode ocorrer caso o usuário informe 0 como divisor.
 * */

import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite o 1° Numero: ");
        int numero1 = leitura.nextInt();
        System.out.print("Digite o 2° Numero: ");
        int numero2 = leitura.nextInt();

        try{
            int resultado =  numero1 / numero2;
            System.out.println("Resultado: "+numero1+" / "+numero2+ " = "+resultado);
        }catch (ArithmeticException e){
            System.out.println("Erro: Divisão por zero não é permitido.");
        }


    }
}
