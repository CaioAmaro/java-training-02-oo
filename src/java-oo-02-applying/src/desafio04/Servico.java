public class Servico implements Vendavel{
    @Override
    public double precoTotal(double valor, int quantidade) {
        double precoTotal = valor*quantidade;
        if(quantidade >= 3){
            System.out.println("Ganhou 10% de desconto.");
            return precoTotal - (precoTotal*0.1);
        }else{
            System.out.println("Nenhum Desconto Aplicado");
            return precoTotal;
        }
    }
}
