package Java;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o screen match");
        System.out.println("Filme: Top Gun Maverick");
        int ano = 2022;
        System.out.println("Ano de lançamento " + ano);
        boolean incluidoNoPlano = false;
        double nota = 8.1;
        double media = (9.8 + 6.3 + nota) /3;
        System.out.println("media " + media);
        String sinopse;
        sinopse = """
                Filme de aventura com galã dos anos 80,
                um homem maluco que dirige um jato
                """;
        System.out.println(sinopse);
        int estrelas;
        estrelas = (int) (media/2);
        System.out.println("estrelas " + estrelas);
   }
}