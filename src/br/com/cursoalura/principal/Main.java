package br.com.cursoalura.principal;

import br.com.cursoalura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.cursoalura.minhasmusicas.modelos.Musicas;
import br.com.cursoalura.minhasmusicas.modelos.PodCasts;

public class Main {
    public static void main(String[] args) {
        Musicas minhaMusica = new Musicas();

        minhaMusica.setTitulo("Forever");
        minhaMusica.setCantor("Kiss");

        for(int i = 0; i < 1000; i++){
            minhaMusica.reproduz();
        }

        for(int i = 0; i <= 50; i++){
            minhaMusica.curte();
        }

        PodCasts meuPodCast = new PodCasts();

        meuPodCast.setTitulo("BolhaDev");
        meuPodCast.setApresentador("Marcus Mendes");

        for(int i = 0; i <= 1000; i++){
            minhaMusica.reproduz();
        }

        for(int i = 0; i <= 50; i++){
            meuPodCast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();

        preferidas.inclui(meuPodCast);
        preferidas.inclui(minhaMusica);

    }
}
