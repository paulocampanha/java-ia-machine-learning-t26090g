// Arquivo: Celular.java
public class Celular {

    // Atributos
    String marca;
    String modelo;
    int bateria;

    // Métodos
    public void carregar() {
        System.out.println("O celular " + this.modelo + " está carregando.");
    }

    public void tocarMusica() {
        System.out.println("O celular " + this.modelo + " está tocando música.");
    }

    public void exibirFicha() {
        System.out.println("-".repeat(30));
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Bateria: " + this.bateria + "%");
        System.out.println();
    }
}