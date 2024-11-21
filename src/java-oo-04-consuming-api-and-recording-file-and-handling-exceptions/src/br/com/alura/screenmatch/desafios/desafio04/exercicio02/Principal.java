/*
* Defina uma classe chamada Titulo com os atributos necessários.
* Em seguida, crie um programa que instancia um objeto Titulo,
* serializa esse objeto para JSON usando a biblioteca Gson e imprime o resultado.
*
* Modifique o programa anterior para que o JSON gerado seja formatado de maneira mais
* elegante. Utilize o método setPrettyPrinting para alcançar esse resultado.
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

        Titulo titulo = new Titulo("Homem Aranha", 2024, 344345.34);
        FileWriter escrita = new FileWriter("titulo_serializado.json");
        escrita.write(gson.toJson(titulo));
        escrita.close();

    }
}
