public class Livro implements Calculavel{
    double valor = 30;

    @Override
    public double calcularPrecoFinal() {
        return valor -= valor * 0.5;
    }
}
