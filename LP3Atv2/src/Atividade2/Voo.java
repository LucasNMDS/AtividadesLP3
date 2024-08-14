package Atividade2;

public class Voo {
    private String numeroVoo;
    private int capacidadeTotal;
    private int assentosReservados;

    public Voo(String numeroVoo, int capacidadeTotal) {
        this.numeroVoo = numeroVoo;
        this.capacidadeTotal = capacidadeTotal;
        this.assentosReservados = 0;
    }

    public synchronized boolean reservarAssento() {
        if (assentosReservados < capacidadeTotal) {
            assentosReservados++;
            return true;
        } else {
            return false;
        }
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }

    public int getAssentosReservados() {
        return assentosReservados;
    }
}
