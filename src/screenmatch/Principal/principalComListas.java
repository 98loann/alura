package screenmatch.Principal;

import screenmatch.Modelos.Filme;
import screenmatch.Modelos.Serie;
import screenmatch.Modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class principalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoLuan = new Filme("O Fabuloso Destino de Amélie Poulain", 2002);
        filmeDoLuan.avalia(9);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoLuan);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getEstrelas() > 2) {
                System.out.println("Classificação: " + filme.getEstrelas());
            }
        }
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Keanu Reeves");
        buscaPorArtista.add("John Travolta");
        buscaPorArtista.add("Samuel Jackson");
        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println("Depois de ordenar: " +buscaPorArtista);
        System.out.println("Lista de títulos ordenados: ");
        Collections.sort(lista);
        System.out.println(lista);
    }
}
