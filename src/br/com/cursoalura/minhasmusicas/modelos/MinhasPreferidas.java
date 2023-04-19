package br.com.cursoalura.minhasmusicas.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if (audio.getClassificacao() >= 8) {
            System.out.println(audio.getTitulo() + "E considerado um sucesso");
        } else{
            System.out.println(audio.getTitulo() + "Tambem e muito curtido");
        }
    }

}
