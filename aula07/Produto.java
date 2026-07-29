/**
 * 
 * Produto
 */

public class Produto {

    String nome;
    double preco;
    int quantidadeEstoque;

    // Construtor 1: Completo (O gerente já sabe quanto tem no estoque inicial)
    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Construtor 2: Simples (O produto foi criado no sistema, mas o caminhão não chegou)
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = 0; // Regra de negócio: começa zerado
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidadeEstoque += quantidade;
        System.out.println(quantidade + " unidades adicionadas ao produto " + this.nome);
    }

    public void vender(int quantidade) {
        // Desafio: Verificando se há estoque suficiente
        if (quantidade <= this.quantidadeEstoque) {
            this.quantidadeEstoque -= quantidade;
            System.out.println("Venda realizada: " + quantidade + "x " + this.nome);
        } else {
            System.out.println("Erro: Estoque insuficiente para o produto " + this.nome);
        }
    }

    public void exibirResumo() {
        System.out.println("Produto: " + this.nome + " | Preço: R$" + this.preco + " | Estoque: " + this.quantidadeEstoque);
    }

}