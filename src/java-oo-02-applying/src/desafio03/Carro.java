public class Carro {
    private String modelo;
    private double precoMedio1;
    private double precoMedio2;
    private double precoMedio3;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecoMedio1(double precoMedio1) {
        this.precoMedio1 = precoMedio1;
    }

    public void setPrecoMedio2(double precoMedio2) {
        this.precoMedio2 = precoMedio2;
    }

    public void setPrecoMedio3(double precoMedio3) {
        this.precoMedio3 = precoMedio3;
    }

    void exibiMaiorEMenorpreco(){
        if(precoMedio1 > precoMedio2 && precoMedio1 > precoMedio3){
            System.out.println("O preco Médio Maior é "+precoMedio1);
        }else if(precoMedio2 > precoMedio1 && precoMedio2 > precoMedio3){
            System.out.println("O preco Médio Maior é "+ precoMedio2);
        }else{
            System.out.println("O preco Médio Maior é "+ precoMedio3);
        }

        if(precoMedio1 < precoMedio2 && precoMedio1 < precoMedio3){
            System.out.println("O preco Médio Menor é "+precoMedio1);
        }else if(precoMedio2 < precoMedio1 && precoMedio2 < precoMedio3){
            System.out.println("O preco Médio Menor é "+ precoMedio2);
        }else{
            System.out.println("O preco Médio Menor é "+ precoMedio3);
        }

    }
}
