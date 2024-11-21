public class Produto implements Vendavel{

    @Override
    public double precoTotal(double valor, int quantidade) {
        double precoTotal = valor*quantidade;
        if(quantidade >= 5){
            System.out.println("Ganhou 30% de desconto.");
            return precoTotal - (precoTotal*0.3);
        }else{
            System.out.println("Nenhum Desconto Aplicado");
            return precoTotal;
        }
    }
}
