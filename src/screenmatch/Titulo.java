package screenmatch;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPla
    private double somaDasAvaliac
    private int totalDeAvaliacoes
    private int duracaoEmMinutos;

    public int getTotalDeAvaliaco
     return totalDeAvaliacoes;
}

    public void setNome(String no
     this.nome = nome;
}

public void setAnoDeLancament
        this.anoDeLancamento = an
        }

public void setIncluidoNoPlan
        this.incluidoNoPlano = in
        }

public void setDuracaoEmMinut
        this.duracaoEmMinutos = d
        }

public void exibeFichaTecnica
        System.out.println("Nome
        System.out.println("Ano d
        System.out.println("Duraç
        System.out.println("Avali
        System.out.println("Inclu
        }

public void avalia(double not
        somaDasAvaliacoes += nota
        totalDeAvaliacoes++;
        }

public double pegaMedia() {
        return somaDasAvaliacoes
        }
public String getNome() {
        return this.nome;
        }
        }
