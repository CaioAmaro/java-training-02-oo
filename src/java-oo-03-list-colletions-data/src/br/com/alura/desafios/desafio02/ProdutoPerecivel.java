public class ProdutoPerecivel extends Produtos{
    private int dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade){
        super(nome, preco, quantidade);
    }

    @Override
    public String toString() {
        return "Produto Perecivel: " + getNome();
    }
}
