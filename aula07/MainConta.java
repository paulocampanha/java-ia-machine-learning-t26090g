
public class MainConta {

    public static void main(String args[]){

        // Criando o objeto com o construtor
        ContaBancaria conta1 = new ContaBancaria(
            "Gaspar Galego", "123.456.789-00", "12.345-6" 
        );

        ContaBancaria conta2 = new ContaBancaria(
            "Anabela Blue", "111.222.333-44", "11.222-3"
        );

        conta1.exibirDados();
        conta2.exibirDados();

        conta1.depositar(5000.00);
        conta2.depositar(8765.32);
        conta1.depositar(-500.00);

        conta1.exibirDados();
        conta2.exibirDados();


    }
}