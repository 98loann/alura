package screenmatch.Principal;

import screenmatch.Modelos.Filme;
import screenmatch.Modelos.Serie;
import screenmatch.Modelos.Titulo;

import java.util.ArrayList;

public class principalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        Filme outroFilme = new Filme("Avatar", 2023);
        var filmeDoLuan = new Filme("O Fabuloso Destino de Amélie Poulain", 2002);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoLuan);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

    }
}