public class ConversorMoeda implements ConversaoFinanceira{

    @Override
    public double converterDolarParaReal(double valorEmDolar) {
        return valorEmDolar / 4.49;
    }

}
