public class Audio {
    private String titulo;
    private int reproducoes;
    private int curtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void reproduzir(){
        reproducoes++;
    }

    public int getReproducoes() {
        return reproducoes;
    }

    public void curtir(){
        curtidas++;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }
}
