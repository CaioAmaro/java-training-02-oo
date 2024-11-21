import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroSorteado = new Random().nextInt(100);
        int tentativas = 5;

        System.out.println("Spoiler *Número Sorteado* -> "+numeroSorteado);


        while(tentativas != 0){
            System.out.println("Você tem ("+ tentativas +") tentativas.");
            System.out.print("Digite seu palpite: ");
            int palpite = leitura.nextInt();
            if(palpite != numeroSorteado){
                if(palpite > numeroSorteado){
                    System.out.println("Número Secreto é menor.");
                }else{
                    System.out.println("Número Secreto é maior");
                }
                System.out.println("*****");
            }else{
                System.out.println("Parabéns você venceu! ");
                break;
            }

            tentativas--;

        }

    }
}
