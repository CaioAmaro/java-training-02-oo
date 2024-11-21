public class ConverterTemperatura {
    public static void main(String[] args){
        double temperaturaCelsius = 10;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        System.out.println("A conversão de " + temperaturaCelsius + "C° para F° é ("+ (int)temperaturaFahrenheit+ "F°)");
    }
}
