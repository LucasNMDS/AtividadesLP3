package Atividade2;

public class Reserva implements Runnable {
    private Voo voo;

    public Reserva(Voo voo) {
        this.voo = voo;
    }

    @Override
    public void run() {
        boolean sucesso = voo.reservarAssento();
        if (sucesso) {
            System.out.println("Reserva feita com sucesso no voo " + voo.getNumeroVoo());
        } else {
            System.out.println("Falha na reserva. Voo " + voo.getNumeroVoo() + " está lotado.");
        }
    }
}
