import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("--- Cadastro de Nova Conta Bancária ---");

            System.out.print("Por favor, digite o nome do Cliente: ");
            String nomeCliente = scanner.nextLine();

            System.out.print("Por favor, digite o número da Agência: ");
                String agencia = scanner.nextLine();

                System.out.print("Por favor, digite o número da Conta: ");
                int numero = scanner.nextInt();

                System.out.print("Por favor, digite o saldo inicial: ");
                double saldo = scanner.nextDouble();

                ContaTerminal conta = new ContaTerminal(numero, agencia, nomeCliente, saldo);

                System.out.println("\n------------------------------------");
                System.out.println("Conta criada com sucesso!");
                System.out.println("------------------------------------");
                System.out.println("Olá " + conta.getNomeCliente() + ", obrigado por criar uma conta em nosso banco!");
                System.out.println("Sua agência é " + conta.getAgencia() + ", conta " + conta.getNumero() + ".");
                System.out.println("Seu saldo de R$ " + String.format("%.2f", conta.getSaldo()) + " já está disponível para saque.");
        } catch (IllegalArgumentException e) {
            System.out.println("\nErro no cadastro: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("\nERRO: Tipo de dado inserido é inválido. Por favor, insira um número válido para conta e saldo.");
        }
    }
}