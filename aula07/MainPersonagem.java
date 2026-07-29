/**
 * Nesse programa vamos instanciar os personagem da classe Personagem
 * 
 */

public class MainPersonagem {
    
    public static void main(String args[]) {
        System.out.println("--- Criando Personagem ---");
        Personagem jogador1 = new Personagem("Fantomas", 
        "Guerreiro Morto Vivo", 80);
        jogador1.exibirStatus();
        
        System.out.println("\n--- Criando Personagem ---");
        Personagem jogador2 = new Personagem("Pepe Legal");
        jogador2.exibirStatus();

        jogador1.alterarClasse("Super Guerreiro", 100);
        jogador1.exibirStatus();

        jogador2.alterarClasse("Mago da Luz", 70);
        jogador2.exibirStatus();




        

    }
}
