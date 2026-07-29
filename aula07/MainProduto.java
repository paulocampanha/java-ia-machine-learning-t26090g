/**
 * 
 * MainProduto
 */
public class MainProduto {
    
    public static void main(String[] args) {
        
        System.out.println("--- Cadastrando Produtos ---\n");

        // Utiliza o Construtor 1 (Completo)
        Produto produto1 = new Produto("Notebook", 3500.00, 10);
        
        // Utiliza o Construtor 2 (Simples - estoque começa em 0)
        Produto produto2 = new Produto("Mouse sem fio", 89.90);

        // Imprimindo o estado inicial
        produto1.exibirResumo();
        produto2.exibirResumo();

        System.out.println("\n--- Movimentando o Estoque ---\n");

        // Movimentações do Notebook
        produto1.vender(2);
        
        // Movimentações do Mouse
        produto2.adicionarEstoque(50);
        produto2.vender(5);

        System.out.println("\n--- Resumo Final ---\n");
        produto1.exibirResumo();
        produto2.exibirResumo();
    }
}