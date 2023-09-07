package entities;
import java.util.Scanner;
public class Conta {
    int numeroDaConta;
    String agencia;
    String nomeDoCliente;
    double saldo;
    public Conta(int numeroDaConta, String agencia, String nomeDoCliente, double saldo){
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
        this.nomeDoCliente = nomeDoCliente;
        this.saldo = saldo;
    }
    public Conta(){}
    public static void depositar(Scanner scanner) {
        double valor;
        System.out.print("Quanto deseja depositar: ");
        valor = scanner.nextDouble();
        Conta.depositar(scanner);
    }
    public int getNumeroDaConta() {
        return this.numeroDaConta;
    }
    public void setNumeroDaConta(int newValue){
        this.numeroDaConta = newValue;
    }
    public String getAgencia(){
        return this.agencia;
    }
    public void setAgencia(String newValue){
        this.agencia = newValue;
    }
    public String getNomeDoCliente(){
        return this.nomeDoCliente;
    }
    public void setNomeDoCliente(String newValue){
        this.nomeDoCliente = newValue;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double newValue){
        this.saldo = newValue;
    }
}
