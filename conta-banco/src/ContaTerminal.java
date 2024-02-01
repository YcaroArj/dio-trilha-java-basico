import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        String NomeCliente = "Mario Andrade";
        Double Saldo = 237.48;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta");
        int Numero = scanner.nextInt();

        scanner.nextLine(); // Limpa o buffer

        System.out.println("Por favor, digite o número da Agência ");
        String Agencia = scanner.nextLine();

        System.out.println(
                "Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia
                        + ", conta " + Numero + " e seu saldo R$ " + Saldo + " já está disponivel para saque.");

    }
}
