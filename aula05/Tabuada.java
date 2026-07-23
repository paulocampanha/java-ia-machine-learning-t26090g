/*
Nesse programa vamos estudar a estrutura de repetição
while e criar uma tabuada
5 X 1 = 5
5 X 2 = 10
5 X 3 = 15
*/

public class Tabuada {
    public static void main(String args[]) {
        int contador = 1;
        int numero = 1;
        int total = 0;
        while (contador <= 10 && numero <= 10) {
            total = contador * numero;
            System.out.println(
                numero + " X " + contador + " = " + total
            );
            contador++; // contador = contador + 1
            if (contador == 11){
                contador = 1;
                numero++;
                System.out.println("=".repeat(40));
            }
        }
    }
}