/*
 * Defina uma classe chamada Veiculo com os atributos necessários.
 * Em seguida, crie um programa que instancia um objeto Veiculo,
 * serializa esse objeto para JSON usando a biblioteca Gson e imprime o resultado.
 *
 * */

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        Veiculo carro = new Veiculo("Corolla", "Preto", 59000.00);

        FileWriter escrita = new FileWriter("veiculos.json");
        escrita.write(gson.toJson(carro));
        escrita.close();

        System.out.println(gson.toJson(carro));


    }
}
