/*
Nesse programa vamos estudar o uso da estrura de decisão
if...else if...else.
 */

public class ConceitoFinal {
    
    // Método Princilpal (main)
    public static void main(String args[]){

        double nota = 8.9;
        int faltas = 6;
        String nome = "Gaspar Rodrigues";

        if (nota >= 9) {
            System.out.println("O aluno " + nome + 
            " foi APROVADO COM LOUVOR!!!");
            System.out.println("Sua nota final foi " + nota);
        } else if (nota >= 6) {
            System.out.println("O aluno " + nome + 
            " foi APROVADO!");
            System.out.println("Sua nota final foi " + nota);
        } else if (nota >= 3) {
            System.out.println("O aluno " + nome + 
            " ficou de REUPERAÇÃO.");
            System.out.println("Sua nota final foi " + nota);
        } else {
            System.out.println("O aluno " + nome + 
            " foi REPROVADO");
            System.out.println("Sua nota final foi " + nota);
        }
    }
}
