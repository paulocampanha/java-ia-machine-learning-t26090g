/*
Nesse programa vamos estudar o uso de classes. A classe 
Carro será usar como planta baixa de outros carros.
*/

public class Carro {
    
    // Atributos da classe
    String nome;
    String cor;
    int passageiros;

    // Métodos da classe
    public void ligar() {
        System.out.println("O carro " +
            this.nome + " está ligado."
        );
    }

    public void desligar() {
        System.out.println("O carro " +
            this.nome + " está desligado."
        );
    }
    public void informacao(){
        System.out.println("=".repeat(40));
        System.out.println("Nome do carro: " + this.nome);
        System.out.println("Cor do carro: " + this.cor);
        System.out.println(
            "Nº. de Passageiros: " + this.passageiros);
        System.out.println("=".repeat(40));
    }

}
