package Exercicio06;

public class Livro {
private int totalPaginas;

	public Livro(int totalPaginas) {
		this.totalPaginas = totalPaginas;
}

	public void lerPagina(int pagina) throws IllegalArgumentException {
		if (pagina < 1 || pagina > totalPaginas) {
			throw new IllegalArgumentException("Página " + pagina + " inválida. Fora do intervalo permitido (1-" + totalPaginas + ").");
		} else {
			System.out.println("Lendo a página " + pagina + " de livro.");
		}
	}

	public int getTotalPaginas() {
		return totalPaginas;
	}

	public static void main(String[] args) {
		Livro livro = new Livro(100);

		try {
			livro.lerPagina(50);
			livro.lerPagina(0); 
			livro.lerPagina(400);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}