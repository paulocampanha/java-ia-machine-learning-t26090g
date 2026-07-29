/**
 * Nesse programa vamos estudar o uso de classe de objetos com o
 * construtor.
 */

public class ContaBancaria {

    // Atributos
    String titular;
    String cpf;
    String numeroConta;
    double saldo;

    // Construtor
    public ContaBancaria(String titular, String cpf, String numeroConta){
        this.titular = titular;
        this.cpf = cpf;
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        if (valor > 0){
            this.saldo += valor; // saldo = saldo + valor
            System.out.println("Deposito de R$ " + 
                String.format("%.2f", valor) + " realizado com sucesso.");
        } else {
            System.out.println("Valor do deposito inválido.");
        }
    }

    public void exibirDados(){
        System.out.println("=".repeat(40));
        System.out.println("Cliente: " + this.titular);
        System.out.println("Saldo da conta: " + this.numeroConta);
        System.out.println("R$ " + String.format("%.2f", this.saldo));
    }
}