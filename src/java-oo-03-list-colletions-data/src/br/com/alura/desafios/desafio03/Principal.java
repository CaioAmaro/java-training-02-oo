import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria(34.2 , 332);
        ContaBancaria conta2 = new ContaBancaria(20.3, 42423);
        ContaBancaria conta3 = new ContaBancaria(10.2, 42452);
        ContaBancaria conta4 = new ContaBancaria(70.1, 43232);
        ContaBancaria conta5 = new ContaBancaria(5.0,123);
        ContaBancaria conta6 = new ContaBancaria(2.3, 1353);

        ArrayList<ContaBancaria> listaDeContas = new ArrayList();

        listaDeContas.add(conta1);
        listaDeContas.add(conta2);
        listaDeContas.add(conta3);
        listaDeContas.add(conta4);
        listaDeContas.add(conta5);
        listaDeContas.add(conta6);

        ContaBancaria contaBancariaComMaiorSaldo = listaDeContas.get(0);

        for(ContaBancaria item: listaDeContas){
            if(item.getSaldo() > contaBancariaComMaiorSaldo.getSaldo()){
                contaBancariaComMaiorSaldo = item;
            }
        }

        System.out.println("A conta Bancária com maior saldo é: " + contaBancariaComMaiorSaldo.getNumeroConta() + " R$ "+ contaBancariaComMaiorSaldo.getSaldo());




//        Quadrado quadrado = new Quadrado(4);
//        Circulo circulo = new Circulo(4);
//
//        ArrayList<Forma> formas = new ArrayList<>();
//
//        formas.add(quadrado);
//        formas.add(circulo);
//
//        for(Forma item: formas){
//            item.calcularArea();
//            System.out.println("Área calculada é: " + item.getArea()+"cm²");
//        }

//        Produto produto1 = new Produto(3.4);
//        Produto produto2 = new Produto(5.2);
//        Produto produto3 = new Produto(4.5);
//
//        ArrayList<Produto> produtos = new ArrayList<>();
//
//        produtos.add(produto1);
//        produtos.add(produto2);
//        produtos.add(produto3);
//
//        double media = 0;
//        for(Produto item: produtos){
//            media += item.getPreco();
//        }
//
//        System.out.println("A média dos preços é "+ media/produtos.size());


//        Animal dog = new Cachorro();
//        dog.setNome("Todynho");
//
//        if(dog instanceof Cachorro){
//            Animal animal = (Animal) dog;
//            System.out.println(animal.getNome());
//        }


//        ArrayList<String> listaStrings = new ArrayList<>();
//
//        listaStrings.add("Caio");
//        listaStrings.add("Teste");
//        listaStrings.add("Amaro");
//
//        for(String item: listaStrings){
//            System.out.println(item);
//        }

    }
}
