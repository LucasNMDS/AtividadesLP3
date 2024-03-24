package Exercicio02;
import java.util.*;

public class main {
    public static void main(String[] args) {

        List<String> listaDeCompras = new ArrayList<>();

        listaDeCompras.add("Maçã");
        listaDeCompras.add("Banana");
        listaDeCompras.add("Pão");
        listaDeCompras.add("Leite");
        listaDeCompras.add("Ovos");

        System.out.println("Itens na lista de compras:");
        for (String item : listaDeCompras) {
            System.out.println(item);
        }

        listaDeCompras.remove("Pão");

        System.out.println("\nApós remover o item 'Pão':");
        for (String item : listaDeCompras) {
            System.out.println(item);
        }
    }
}
