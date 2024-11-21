public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    void aplicarDesconto(double percentualDesconto){
        double valorDesconto = (percentualDesconto/100) * preco;
        System.out.println("O valor do desconto é "+ valorDesconto);
        preco -= valorDesconto;
    }
}
