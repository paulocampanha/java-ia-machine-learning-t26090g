// Arquivo: MainCelular.java
public class MainCelular {

    public static void main(String[] args) {

        // Criando os três objetos "vazios" (usando o construtor padrão invisível do
        // Java)
        Celular celular1 = new Celular();
        Celular celular2 = new Celular();
        Celular celular3 = new Celular();

        // Atribuindo valores para o primeiro celular (linha a linha)
        celular1.marca = "Apple";
        celular1.modelo = "iPhone 13";
        celular1.bateria = 85;

        // Atribuindo valores para o segundo celular
        celular2.marca = "Samsung";
        celular2.modelo = "Galaxy S23";
        celular2.bateria = 40;

        // Atribuindo valores para o terceiro celular
        celular3.marca = "Motorola";
        celular3.modelo = "Moto G200";
        celular3.bateria = 15;

        // Executando ações (métodos)
        celular1.carregar();
        celular2.tocarMusica();

        System.out.println("-".repeat(30));
        System.out.println("*****  Fichas  Técnicas  *****");
        celular1.exibirFicha();
        celular2.exibirFicha();
        celular3.exibirFicha();
    }
}