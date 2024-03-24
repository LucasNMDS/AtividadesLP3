package Exercicio05;

public class televisão implements dispositivoEletronico {
    @Override
    public void ligar() {
        System.out.println("Ligando a televisão...");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando a televisão...");
    }
}