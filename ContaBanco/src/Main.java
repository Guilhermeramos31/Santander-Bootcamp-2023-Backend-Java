import entities.Conta;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta = criarConta(scanner);
        System.out.println("Olá " + conta.getNomeDoCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + ", conta é " + conta.getNumeroDaConta() + " e seu saldo " + conta.getSaldo() + " já está disponivel para saque.");
    }
    static Conta criarConta(Scanner scanner){
        Conta conta = new Conta();
        List<String> textos = List.of(
                "Digite o numero da sua conta: ",
                "Digite o numero da sua agencia: ",
                "Digite seu nome: ",
                "Quanto deseja depositar: "
        );
        System.out.print(textos.get(0));
        conta.setNumeroDaConta(scanner.nextInt());
        System.out.print(textos.get(1));
        conta.setAgencia(scanner.next());
        System.out.print(textos.get(2));
        conta.setNomeDoCliente(scanner.next() + " " + scanner.next());
        System.out.print(textos.get(3));
        conta.setSaldo(scanner.nextDouble());
        return conta;
    }
} 