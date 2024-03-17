package Exercicio04;

public class violao extends InstrumentoMusical {
	 @Override
	 public void tocar() {
	     System.out.println("Tocando violão...");
	 }
	    @Override
	    public void afinar() {
	        System.out.println("Afinando violão...");
	    }
}
