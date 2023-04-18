package screenmatch.Calculos;

import screenmatch.Episodio;

public class FiltroRecomendacao {
    public void filtra(Classificacao classificacao){
        if (classificacao.getEstrelas()>=4){
            System.out.println("Está entre os preferidos do momento");
        }else if (classificacao.getEstrelas()>=2){
            System.out.println("Muito bem avaliado");
        }else {
            System.out.println("Não tão bem avaliado");
        }

    }
}
