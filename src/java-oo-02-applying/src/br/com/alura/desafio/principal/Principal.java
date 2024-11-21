import MinhasPreferidas;
import Musica;
import Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setArtista("Kiss");

        for(int i=0; i<1000; i++){
            minhaMusica.reproduzir();
        }

        for(int i=0; i<50; i++){
            minhaMusica.curtir();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setDescricao("Marcus Mendes");

        for(int i=0; i<1000; i++){
            meuPodcast.reproduzir();
        }

        for(int i=0; i<50; i++){
            meuPodcast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);



    }
}
