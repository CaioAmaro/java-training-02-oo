import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pessoa funcionario = new Pessoa();
        Pessoa cliente = new Pessoa();
        Pessoa gerente = new Pessoa();

        funcionario.setNome("João");
        funcionario.setIdade(29);
        cliente.setNome("Marcos");
        cliente.setIdade(23);
        gerente.setNome("Matheus");
        gerente.setIdade(12);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(funcionario);
        listaDePessoas.add(cliente);
        listaDePessoas.add(gerente);


        System.out.println("Quantidade de pessoa da na lista é: "+ listaDePessoas.size());
        System.out.println("A primeira Pessoa da lista é "+ listaDePessoas.get(0));
        System.out.println("Lista Completa é:");
        System.out.println(listaDePessoas);
    }
}
