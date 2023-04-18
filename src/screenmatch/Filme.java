package screenmatch;

import screenmatch.Calculos.Classificacao;

public class Filme extends Titulo implements Classificacao {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getEstrelas() {
        return (int)pegaMedia() /2;
    }

    @Override
    public String toString() {
        return "Filme: " +this.getNome() + " (" + this.getAnoDeLancamento()+")";
    }
}