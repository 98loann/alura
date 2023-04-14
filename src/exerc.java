import java.util.Scanner;

public class exerc {
    public static void main (String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println(" ** Programa pra conversão de temperaturas ** ");
        System.out.println("Entre com a temperatura em Celsius ");
        double temperatura = leitor.nextDouble();
        double fahrenheit =  (temperatura * 1.8) + 32;
        System.out.println("A temperatura " + temperatura + " em Fahrenheit é " + fahrenheit);
    }
}
