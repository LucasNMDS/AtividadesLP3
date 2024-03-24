package Exercicio2;

public class Estudante {

	public String nome;
    public int idade;
    public double nota;

    public Estudante(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public boolean aprovado() {
        return nota >= 7.0;
    }
	
}
