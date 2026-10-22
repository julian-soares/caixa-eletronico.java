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
                    "[1] - Consultar Saldo%n" +
                    "[2] - Depositar%n" +
                    "[3] - Sacar%n" +
                    "[4] - Sair%n");

            System.out.print("Escolha: ");
            byte escolhaMenu = scanner.nextByte();

            if (escolhaMenu < 1 || escolhaMenu > 4) {
                System.out.println("Opcção Inválida! Selecione Novamente...");
                continue;
            }

            switch (escolhaMenu) {
                case 1:
                    System.out.println("Seu saldo é de R$" + saldo);
                    break;

                case 2:
                    System.out.print("Valor à depositar: ");
                    BigDecimal valorDepositado = scanner.nextBigDecimal();
                    saldo = saldo.add(valorDepositado);

                    if (valorDepositado.compareTo(BigDecimal.ZERO)<=0){
                        System.out.println("Depósito inválido!");
                        break;
                    }

                case 3:

            }

        }

        scanner.close();
    }

}
