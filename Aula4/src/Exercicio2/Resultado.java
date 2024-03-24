package Exercicio2;

public class Resultado {

	public static void main(String[] args) {
		Estudante estudante1 = new Estudante ("Marcos", 2, 5.5);
		Estudante estudante2 = new Estudante("João", 20, 8.5);

        if (estudante1.aprovado()) {
            System.out.println(estudante1.nome + " foi aprovado!");
        } else {
            System.out.println(estudante1.nome + " foi reprovado.");
        }
        
        if (estudante2.aprovado()) {
            System.out.println(estudante2.nome + " foi aprovado!");
        } else {
            System.out.println(estudante2.nome + " foi reprovado.");
        }
    }

}
