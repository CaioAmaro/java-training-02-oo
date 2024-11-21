import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int sair = 1;
        CartaoCredito cartaocredito = new CartaoCredito(100);
        cartaocredito.setLimite();

        List<Produto> listaDeCompras = new ArrayList<>();

        Scanner ler = new Scanner(System.in);

        while(sair == 1){
            Produto produto = new Produto();
            produto.oferecer(cartaocredito, listaDeCompras);
            if(cartaocredito.getLimite() == 0){
                System.out.println();
                System.out.println("Você não possui mais crédito disponivel.");
                System.out.println();
                break;
            }

            System.out.println("Seu crédito disponivel é R$" + cartaocredito.getLimite());
            System.out.println("Digite (O) para Sair");
            System.out.println("Digite (1) para Continuar Comprando");
            System.out.print("Escolha: ");
            sair = ler.nextInt();
            System.out.println();

            if(sair == 0){
                System.out.println("Você saiu");
            }

            System.out.println();
        }

        Collections.sort(listaDeCompras);

        System.out.println("Lista de Compras: Order By Value");
        for(Produto item: listaDeCompras){
            System.out.println(item);
        }


    }
}
