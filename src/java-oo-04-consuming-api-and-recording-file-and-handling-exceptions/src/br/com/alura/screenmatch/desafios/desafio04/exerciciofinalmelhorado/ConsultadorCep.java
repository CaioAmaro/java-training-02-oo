import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultadorCep {

    public Endereco consultar(String busca){
        Gson gson = new Gson();
        URI endereco = URI.create("https://viacep.com.br/ws/"+busca+"/json/");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return gson.fromJson(response.body(), Endereco.class);

        }catch (IOException | InterruptedException | JsonSyntaxException e) {
            throw  new RuntimeException("Não consegui obter o cep!");
        }
    }
}
