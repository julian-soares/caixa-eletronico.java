import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BigDecimal saldo = new BigDecimal("0.00");
        Scanner scanner = new Scanner(System.in);
        boolean continuarOperacao = true;
        while (continuarOperacao) {
            System.out.printf("================%n" +
                    "CAIXA ELETRÔNICO%n" +
                    "================%n" +
                    "Saldo atual: " + saldo + "%n");

            System.out.printf("Selecione uma opção:%n" +
                    "[1] - Depositar%n" +
                    "[2] - Sacar%n" +
                    "[3] - Sair%n");

            System.out.print("Escolha: ");
            byte escolhaMenu = scanner.nextByte();

            if (escolhaMenu < 1 || escolhaMenu > 4) {
                System.out.println("Opcção Inválida! Selecione Novamente...");
                continue;
            }

            switch (escolhaMenu) {
                case 1:
                    System.out.print("Valor à depositar: ");
                    BigDecimal valorDeposito = scanner.nextBigDecimal();

                    if (valorDeposito.compareTo(BigDecimal.ZERO) <= 0) {
                        System.out.println("Depósito inválido!");
                        break;
                    }
                    saldo = saldo.add(valorDeposito);
                    break;

                case 2:
                    System.out.print("Valor à sacar: ");
                    BigDecimal valorSaque = scanner.nextBigDecimal();

                    if (valorSaque.compareTo(BigDecimal.ZERO) <= 0) {
                        System.out.println("Saque inválido!");
                        break;
                    }
                    saldo = saldo.subtract(valorSaque);
                    break;

                case 3:
                    System.out.println("Encerrando...");
                    continuarOperacao = false;
                    break;
            }

        }

        scanner.close();
    }

}
