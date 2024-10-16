
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
                   
        System.out.println("Digite o número da agência:");
            String numeroAgencia = scanner.next();
            
        System.out.println("Digite o número da conta bancária:");
            int numeroConta = scanner.nextInt();
            scanner.nextLine();
            
        System.out.println("Digite o seu nome completo:");
            String nomeCliente = scanner.nextLine();
            
        System.out.println("Digite o saldo em conta:");
            Double saldo = scanner.nextDouble();

        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + 
        ", conta " + numeroConta + " e seu saldo de " + "R$" + saldo + " já está disponível para saque!");
    }
}
