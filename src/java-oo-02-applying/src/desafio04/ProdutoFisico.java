public class ProdutoFisico implements Calculavel{
    double valor = 50;

    @Override
    public double calcularPrecoFinal() {
        return valor -= valor*0.1;
    }
}
