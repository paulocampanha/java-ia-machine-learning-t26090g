/**
 * Nessa classe vamos criar um vetor dinâmico que cresce sozinho
 * É a implementação mais usada para listas, sendo excelente para
 * buscas rápidas por posição
 */

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class CategorizadorDeDados{

    public static void main(String args[]){

        // Criando um conjunto de dados estruturado
        List<Pessoa> baseDados = new ArrayList<>();
        baseDados.add(new Pessoa("Gaspar", 18));
        baseDados.add(new Pessoa("Luiza", 25));
        baseDados.add(new Pessoa("Anabela", 15));
        baseDados.add(new Pessoa("Jorge", 35));
        baseDados.add(new Pessoa("Ana", 16));
        baseDados.add(new Pessoa("Carlos", 23));
        baseDados.add(new Pessoa("Beatriz", 14));
        baseDados.add(new Pessoa("Daniel", 30));
        baseDados.add(new Pessoa("Eduardo", 38));
        baseDados.add(new Pessoa("Bruce", 12));

        // Criando um mapa (HashMap) para categorizar (Classificar)
        // A chave (String) será a Categoria ("Maior de Idade" ou 
        // "Menor de Idade")
        // O valor será a lista de pessoas que pertencem a essa categoria
        Map<String, List<Pessoa>> dadosCategorizados = new HashMap<>();
        dadosCategorizados.put("Maior de Idade", new ArrayList<>());
        dadosCategorizados.put("Menor de Idade", new ArrayList<>());

        // Processamento: Lendo os dadosbrutos e classificando
        for (Pessoa p: baseDados) {
            if (p.idade >= 18) {
                // Adiciona na categoria "Maior de Idade"
                dadosCategorizados.get("Maior de Idade").add(p);
            } else {
                dadosCategorizados.get("Menor de Idade").add(p);
            }
        }

        // Exibir a informação categorizada
        System.out.println("--- Dados Classificados ---");
        for (String categoria: dadosCategorizados.keySet()) {
            System.out.println("Categoria: " + categoria);
            for (Pessoa p: dadosCategorizados.get(categoria)) {
                System.out.println(" - " + p.nome + " (" + p.idade + " anos)");
            }
            System.out.println();
        }

    }
}