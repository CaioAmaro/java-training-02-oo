public class ContaCorrente extends ContaBancaria{
    void cobrarTarifaMensal(double valor){
        System.out.println("Cobrança de Tarifa Mensal feita com Sucesso!");
        descontarTributos(valor);
    }
}
