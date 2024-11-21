public class CalculadoraSalaRetangular implements CalculoGeometrico{
    @Override
    public double calcularArea(double altura, double largura) {
        return largura * altura;
    }

    @Override
    public double calcularPerimetro(double altura, double largura) {
        return 2 * (altura+largura);
    }
}
