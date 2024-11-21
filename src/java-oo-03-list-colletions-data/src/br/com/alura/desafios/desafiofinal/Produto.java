import java.util.List;
import java.util.Scanner;

public class Produto implements Comparable<Produto>{
    private String descricao;
    private double valor;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao() {
        Scanner ler = new Scanner(System.in);
        System.out.print("Descrição do produto: ");
        this.descricao =  ler.next();
    }

    public double getValor() {
        return valor;
    }

    public void setValor(CartaoCredito cartaoCredito) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Valor do produto: R$");
        double valor = ler.nextDouble();

        while(valor <= 0 || valor > cartaoCredito.getLimite()){

            while(valor <= 0){
                System.out.println();
                System.out.println("Erro: Valor inválido");
                System.out.println("Escolha um valor igual ou menor que seu limite disponivel (R$ "+cartaoCredito.getLimite()+")");
                System.out.print("R$");
                valor = ler.nextDouble();
            }

            while(valor > cartaoCredito.getLimite()){
                System.out.println();
                System.out.println("Erro: Limite de crédito Insuficiente");
                System.out.println("Escolha um valor igual ou menor que seu limite disponivel (R$ "+cartaoCredito.getLimite()+")");
                System.out.print("R$");
                valor = ler.nextDouble();
            }


        }

        this.valor = valor;
        cartaoCredito.efetuarCompra(valor);

        System.out.println();
        System.out.println(":: Produto Comprado com Sucesso! ::");
        System.out.println();
    }

    public void exibirMenu(CartaoCredito cartaoCredito){
        System.out.println(":::::Menu de Compras:::::");
        System.out.println();
        System.out.println("Crédito Disponivel: R$"+cartaoCredito.getLimite());
        System.out.println("Crédito Utilizado: R$" + (cartaoCredito.getLimiteMaximo() - cartaoCredito.getLimite()));
        System.out.println();
    }

    public void oferecer(CartaoCredito cartaocredito, List<Produto> listaDeCompras){
        this.exibirMenu(cartaocredito);
        this.setDescricao();
        this.setValor(cartaocredito);
        listaDeCompras.add(this);
    }

    @Override
    public String toString() {
        return "Descrição: " + this.getDescricao() + " - Valor: R$" + this.getValor();
    }

    @Override
    public int compareTo(Produto o) {
        if(this.getValor() > o.getValor()){
            return 1;
        }else if(this.getValor() < o.getValor()){
            return -1;
        }else{
            return 0;
        }
    }
}
