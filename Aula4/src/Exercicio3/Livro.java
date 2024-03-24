package Exercicio3;

public class Livro {
    private String titulo;
    private String autor;
    private int anoDePublicacao;

    // Construtor da classe Livro
    public Livro(String titulo, String autor, int anoDePublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    // Método para imprimir os detalhes do livro
    public void imprimirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoDePublicacao);
    }
}
