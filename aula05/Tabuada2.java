/*
Nesse programa vamos estudar a estrutura de repetição for
imprimindo a tabuada de um número
*/
public class Tabuada2 {
    public static void main(String args[]){
        int numero = 5;
        int total = 0;
        for (int i = 1; i <= 10; i++){
            total = numero * i;
            System.out.println(
                numero + " X " + i + " = " + total
            );
        }
    }
}
