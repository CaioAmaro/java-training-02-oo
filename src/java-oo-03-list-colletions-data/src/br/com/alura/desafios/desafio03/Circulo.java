public class Circulo implements Forma{
    private double raio;
    private double area;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public void calcularArea() {
        this.area =  3.14 * (raio*raio);
    }

}
