/*
 * Desenvolva um programa em Java que permite aos usuários consultar informações sobre um usuário do GitHub
 * (utilize a API pública do GitHub para obter os dados). Crie uma classe de exceção personalizada, ErroConsultaGitHubException,
 * que estende RuntimeException. Lance essa exceção quando o nome de usuário não for encontrado. No bloco catch,
 * trate de forma específica essa exceção, exibindo uma mensagem amigável.
 * */

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class GitHub {
    public static void main(String[] args) throws IOException, InterruptedException {
        try {
            Scanner leitura = new Scanner(System.in);
            System.out.println("Pesquisador de Perfil (GITHUB)");
            System.out.print("Digite o nome do user: ");
            String busca = leitura.nextLine();

            String endereco = "https://api.github.com/users/" + busca.toLowerCase().replace(" ", "");

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            Gson gson = new Gson();

            PerfilGitHub perfil = gson.fromJson(json, PerfilGitHub.class);

            if (perfil.login() == null) {
                throw new ErroConsultaGitHubException("Usuário não foi encontrado!");
            }

            System.out.println(perfil);

        }catch(ErroConsultaGitHubException e){
            System.out.println("Usuário não foi encontrado!");
        }

        System.out.println("Programa foi finalizado com sucesso!");

    }
}
