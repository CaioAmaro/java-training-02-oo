import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Produtos produto1 = new Produtos("Sabonote", 2.55, 5);
        Produtos produto2 = new Produtos("Macarrão", 18.3, 3);
        Produtos produto3 = new Produtos("Mouse", 55.2, 8);
        ProdutoPerecivel produto4 = new ProdutoPerecivel("Abacaxi", 2.23, 10);

        ArrayList<Produtos> produtos = new ArrayList<>();

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        System.out.println(produtos.size());
        System.out.println(produtos.get(2).getNome());
        System.out.println(produtos.get(2));

        System.out.println(produto4);

    }
}
