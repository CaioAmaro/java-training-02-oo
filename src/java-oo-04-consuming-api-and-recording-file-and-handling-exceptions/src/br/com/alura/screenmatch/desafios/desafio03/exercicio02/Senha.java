/*
* Crie um programa que lê uma senha do usuário. Utilize o bloco try/catch para capturar a
* exceção SenhaInvalidaException, uma classe de exceção personalizada que deve ser lançada
*  caso a senha não atenda a critérios específicos (por exemplo, ter pelo menos 8 caracteres).
*
* */

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Critérios: Pelo menos 8 Caracteres.");
        System.out.print("Digite uma senha: ");
        String senha = leitura.nextLine();

        if(senha.length() < 8){
            throw new SenhaInvalidaExcpection("Senha digitada não possui pelo menos 8 caracteres.");
        }

        System.out.println("Senha cadastrada com sucesso!");

    }
}
