public class PrincipalDesafio {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.exibirOlaMundo();

        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.retornarDobro(5));

        Musica musica = new Musica();
        musica.titulo = "Travis Scoot";
        musica.artista = "Matue";
        musica.anoLancamento = 2000;

        musica.exibirFichaTecnica();
        musica.avaliar(4);
        musica.avaliar(3.7);
        musica.avaliar(2.3);
        System.out.println(musica.obterMediaAvaliacao());
        musica.exibirFichaTecnica();

        Carro carro = new Carro();

        carro.modelo = "Mustang";
        carro.cor = "Preto";
        carro.anoFabricacao = 2010;

        carro.exibirFicha();

        Aluno aluno = new Aluno();
        aluno.nome = "Caio";
        aluno.idade = 24;
        aluno.obterInfo();
    }
}
