package AppDeMusicas.principal;

import AppDeMusicas.modelos.MinhasPreferidas;
import AppDeMusicas.modelos.Musica;
import AppDeMusicas.modelos.Podcasts;


public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("The Heart Part 5: ");
        minhaMusica.setCantor("Kendrick Lamar");

        for (int i = 0; i < 1000 ; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 50 ; i++) {
            minhaMusica.curte();
        }
        Podcasts meuPodcast = new Podcasts();
        meuPodcast.setTitulo("Jovem Nerd: ");
        meuPodcast.setApresentador("Alexandre Otoni");

        for (int i = 0; i < 5000 ; i++) {
            meuPodcast.reproduz();
        }
        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }
        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);
    }
}