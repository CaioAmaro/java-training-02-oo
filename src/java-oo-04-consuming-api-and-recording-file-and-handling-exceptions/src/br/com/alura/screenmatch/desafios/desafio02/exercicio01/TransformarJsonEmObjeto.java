import com.google.gson.Gson;

public class TransformarJsonEmObjeto {
    public static void main(String[] args) {
        String json = "{\"idade\":\"24\",\"cidade\":\"blumenau\",\"noiva\":\"brunna\"}";

        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(json, Pessoa.class);

        System.out.println(pessoa);

    }
}
