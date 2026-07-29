/**
 * Nessa classe vamos definir a estrutura dos nosso dados
 */

public class Avaliacao {

    String cliente;
    String comentario;
    int nota;  // Entre 1 e 5

    // Construtor
    public Avaliacao(String cliente, String comentario, int nota){
        this.cliente = cliente;
        this.comentario = comentario;
        this.nota = nota;
    }
}