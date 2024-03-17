package Exercicio01;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> minhaLista = new ArrayList<Integer>(); 

        minhaLista.add(10);
        minhaLista.add(20);
        minhaLista.add(30);
        minhaLista.add(40);
        minhaLista.add(50);

        System.out.println("Números na lista:");
        for (Integer numero : minhaLista) {
            System.out.println(numero);
        }
    }
}
