public class Carro {
    String modelo;
    int anoFabricacao;
    String cor;

    void exibirFicha(){
        System.out.println("Modelo: "+ modelo);
        System.out.println("Ano de fabricação: "+ anoFabricacao);
        System.out.println("Cor: "+ cor);
        System.out.println("Idade do Carro: "+ obterIdadeCarro());
    }

    int obterIdadeCarro(){
        return 2024-anoFabricacao;
    }

}
