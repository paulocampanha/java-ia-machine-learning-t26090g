/*
Crie um programa java com o dataset abaixo:
idade   salario     comprou
50      7000        sim
30      5000        sim
25      2000        não
18      1500        não
Crie os vetores conforme o dataset e imprima o modelo

*/

public class Exercicio1 {

    public static void main(String[] args) {

        // Vetores com os dados
        int[] idade = {50, 30, 25, 18};
        double[] salario = {7000, 5000, 2000, 1500};
        String[] comprou = {"sim", "sim", "não", "não"};

        // Impressão do dataset
        System.out.println("IDADE\tSALARIO\t\tCOMPROU");

        for (int i = 0; i < idade.length; i++) {
            System.out.println(idade[i] + "\t" +
                               salario[i] + "\t\t" +
                               comprou[i]);
        }
    }
}

    

