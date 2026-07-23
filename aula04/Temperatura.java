/*
Faça um programa para verificar a temperatura do nosso
ambiente. Se a temperatura estiver acima de 28 graus, imprima
no console "QUENTE", se a temperatura estiver entre 20 graus e
27 graus imprima "AGRADAVEL", se a temperatura estiver entre
10 graus e 19 graus imprima "FRIO". Abaixo de 9 graus imprima
"CONGELANTE".
*/

public class Temperatura {

    public static void main(String args[]){

        double temperatura = 75;

        if (temperatura >= 28) {
            System.out.println("QUENTE");
        } else if (temperatura >= 20) {
            System.out.println("AGRADÁVEL");
        } else if (temperatura >= 10) {
            System.out.println("FRIO");
        } else {
            System.out.println("CONGELANTE");
        }
    }
}
