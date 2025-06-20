import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor de depósito inicial: ");
        double depositoInicial = scanner.nextDouble();
        ContaBancaria contaUser = new ContaBancaria(depositoInicial);

        int opcao;

        do {
            System.out.println("Digite a operação desejada:");
            System.out.println("1- Consultar saldo");
            System.out.println("2- Consultar cheque especial");
            System.out.println("3- Realizar depósito");
            System.out.println("4- Sacar");
            System.out.println("5- Pagar boleto");
            System.out.println("6- Verificar uso cheque especial");
            System.out.println("0- Sair");

            opcao = scanner.nextInt();

            switch (opcao){
                case 1 -> contaUser.consultarSaldo();
                case 2 -> contaUser.consultarChequeEspecial();
                case 3 -> {
                    System.out.println("Valor do depósito:");
                    double valor = scanner.nextDouble();
                    contaUser.depositarDinheiro(valor);
                }
                case 4 -> {
                    System.out.println("Valor do saque:");
                    double valor = scanner.nextDouble();
                    contaUser.sacarDinheiro(valor);
                }
                case 5 -> {
                    System.out.println("Valor do boleto:");
                    double valor = scanner.nextDouble();
                    contaUser.pagarBoleto(valor);
                }
                case 6 -> contaUser.verificarUsoChequeEspecial();
                case 0 -> System.out.println("Fim acesso");
                default -> System.out.println("Opção inválida");
            }
        }while (opcao != 0);

        }
    }
