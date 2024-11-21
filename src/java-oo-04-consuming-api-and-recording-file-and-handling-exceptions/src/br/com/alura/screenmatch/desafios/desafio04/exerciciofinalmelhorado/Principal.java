import com.google.gson.JsonSyntaxException;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ConsultadorCep consultadorCep = new ConsultadorCep();
        GeradorArquivoJson geradorArquivoJson = new GeradorArquivoJson();

            System.out.print("Digite o CEP: ");
            String busca = leitura.nextLine();

        try {
            Endereco endereco = consultadorCep.consultar(busca);
            System.out.println(endereco);
            geradorArquivoJson.gerarJson(endereco);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Programa Finalizado.");

    }
}
