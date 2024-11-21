public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao = 0;
    int numAvaliacaoes = 0;

    void exibirFichaTecnica(){
        System.out.println("Titulo: "+ titulo);
        System.out.println("Artista: "+ artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);
        System.out.println("Avaliação: "+ avaliacao);
        System.out.println("Quantas Pessoas Avaliaram: "+ numAvaliacaoes);
    }

    void avaliar(double nota){
        avaliacao += nota;
        numAvaliacaoes++;
    }

    double obterMediaAvaliacao(){
        return avaliacao/numAvaliacaoes;
    }

}
