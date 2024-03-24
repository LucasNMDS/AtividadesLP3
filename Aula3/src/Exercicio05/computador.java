package Exercicio05;

public class computador implements dispositivoEletronico {
    @Override
    public void ligar() {
        System.out.println("Ligando o computador...");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando o computador...");
    }
}
