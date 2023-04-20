package screenmatch.Calculos;

import screenmatch.Modelos.Titulo;

public class Calculadora {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }
/*     public void inclui(Filme f){
        tempoTotal += f.getDuracaoEmMinutos();
    }
   public void inclui(Serie s){
        tempoTotal += s.getDuracaoEmMinutos();
    }*/
    public void inclui (Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
