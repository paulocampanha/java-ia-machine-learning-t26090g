/*
Nesse programa vamos instanciar os objetos da classe Carro
*/

public class MainCarro {    
    public static void main(String arg[]){

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();

        carro1.nome = "Fiat Uno";
        carro1.cor = "Preto";
        carro1.passageiros = 5;

        carro2.nome = "Fiat Strada";
        carro2.cor = "Azul";
        carro2.passageiros = 2;

        carro3.nome = "Fiat Doublo";
        carro3.cor = "Vermelho";
        carro3.passageiros = 7;

        carro1.ligar();
        carro2.ligar();
        carro3.ligar();

        carro1.desligar();
        carro2.desligar();
        carro3.desligar();

        carro1.informacao();
        carro2.informacao();
        carro3.informacao();
    }
}
