public class PrincipalDesafio {

    public static void main(String[] args) {
          //Exercicio 4
          NumerosPrimos numerosPrimos = new NumerosPrimos();
          System.out.println(numerosPrimos.verificarPrimo(13));
          numerosPrimos.listarPrimos(1000);
          System.out.println();
          VerificadorPrimo verificador = new VerificadorPrimo();
          verificador.verificarSeEhPrimo(4);
          GeradorPrimo gerador = new GeradorPrimo();
          gerador.gerarProximoPrimo(94);

//        //Exercicio 3
//        ContaCorrente conta = new ContaCorrente();
//
//        conta.depositar(1000);
//        conta.consultarSaldo();
//        conta.sacar(500);
//        conta.consultarSaldo();
//        conta.cobrarTarifaMensal(30);
//        conta.consultarSaldo();

        //Exercicio 2
//        Animal animal = new Animal();
//        Gato gato = new Gato();
//        Cachorro cachorro = new Cachorro();
//
//        animal.emitirSom();
//        gato.emitirSom();
//        cachorro.emitirSom();
//
//        gato.arranharMoveis();
//        cachorro.abanarRabo();

        //Exercicio 1
//        ModeloCarro carro = new ModeloCarro();
//        carro.setModelo("Camaro");
//        carro.setPrecoMedio1(2943);
//        carro.setPrecoMedio2(5044);
//        carro.setPrecoMedio3(1234);
//        carro.exibiMaiorEMenorpreco();
    }
}
