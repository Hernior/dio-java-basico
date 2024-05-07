import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta:");
        int Numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, digite o número da Agência:");
        String Agencia = sc.nextLine();

        System.out.println("Por favor, digite o nome do(a) cliente:");
        String NomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o saldo bancário (decimal):");
        double Saldo = sc.nextDouble();

        System.out.println("Numero: " + Numero);
        System.out.println("Agencia: " + Agencia);
        System.out.println("NomeCliente: " + NomeCliente);
        System.out.println("Saldo: " + Saldo);

        System.out.println("Olá " + NomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é "
                + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque.");
    }
}
