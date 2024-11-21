public class Titulo {

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalDeAvaliacaoes = 0;
    private int duracaoEmMinutos;

    public int getTotalDeAvaliacaoes(){
        return totalDeAvaliacaoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome "+ nome);
        System.out.println("Ano de Lançamento: "+ anoDeLancamento);
    }

    public void avalia(double nota){
        somaAvaliacoes += nota;
        totalDeAvaliacaoes++;
    }

    public double obterMedia(){
        return somaAvaliacoes/totalDeAvaliacaoes;
    }

}
