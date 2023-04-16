import java.util.Scanner;
public class ContaBancaria {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float saldoConta;
        String dados;
        int operacao;
        System.out.println("Qual seu nome? ");
        String nome = leitor.nextLine();
        System.out.println("Qual o tipo de conta? ");
        String tipoConta = leitor.nextLine();
        System.out.println("Qual o saldo em conta? ");
        saldoConta = leitor.nextFloat();
        dados = """
                *******************************
                Dados iniciais do Cliente
                                
                Nome: %s !
                Tipo conta: %s
                Saldo inicial: $%.2f
                *******************************\s
                """.formatted(nome, tipoConta, saldoConta);
        System.out.println(dados);
        System.out.println("\n Operacoes \n");
        String operacoes;
        operacoes = """
                1 - Consultar Saldo
                2 - Receber valor
                3 - Transferir Valor
                4 - Sair
                """;
        do {
            System.out.println(operacoes);
            operacao = leitor.nextInt();
            switch (operacao) {
                case 1 -> System.out.println(saldoConta);
                case 2 -> {
                    System.out.println("Qual valor a ser recebido ?");
                    float valorReceber = leitor.nextFloat();
                    saldoConta += valorReceber;
                    System.out.println(saldoConta);
                }
                case 3 -> {
                    System.out.println("Qual valor deseja transferir? ");
                    float valorTransferir = leitor.nextFloat();
                    if (valorTransferir > saldoConta) {
                        System.out.println("Saldo insuficiente");
                    } else
                        saldoConta -= valorTransferir;
                    System.out.println(saldoConta);
                }
                default -> System.out.println("Ate mais!");
            }
        }while (operacao != 4) ;
    }
}