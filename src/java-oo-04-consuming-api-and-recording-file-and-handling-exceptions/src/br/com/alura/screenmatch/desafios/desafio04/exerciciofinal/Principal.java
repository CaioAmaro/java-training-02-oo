import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.print("Digite o CEP: ");
        Scanner ler = new Scanner(System.in);
        String busca = ler.nextLine();
        String endereco = "https://viacep.com.br/ws/"+busca+"/json/";


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        try {
            Gson gson = new Gson();
            Cep cep = gson.fromJson(json, Cep.class);

            FileWriter escrita = new FileWriter("cep.json");
            escrita.write(json);
            escrita.close();
        }catch (JsonSyntaxException e){
            System.out.println("Cep não encontrado.");
        }

        System.out.println(json);
    }
}
