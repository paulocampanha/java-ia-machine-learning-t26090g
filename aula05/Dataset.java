/*
Nesse programa vamos estudar um dataset com varios
registros
*/
public class Dataset {
    public static void main(String args[]){
        int[] horas = {10, 8, 6, 4, 2, 1};
        String[] resultado = {
            "Aprovado",
            "Aprovado",
            "Aprovado",
            "Reprovado",
            "Reprovado",
            "Reprovado"
        };
        for (int i = 0; i < horas.length; i++) {
            System.out.println(
                horas[i] + " horas de estudo. Resultado: " + 
                resultado[i]
            );
        }

    }
}
