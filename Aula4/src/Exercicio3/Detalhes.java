package Exercicio3;

public class Detalhes {

	public static void main(String[] args) {
		Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
		Livro livro2 = new Livro("Jurassic Park", "Michael Crichton", 1990);

	    livro1.imprimirDetalhes();
	    System.out.println();
	    livro2.imprimirDetalhes();
	}

}
