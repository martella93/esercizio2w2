package esercizio2;

import java.util.*;

public class Esercizio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi quanti numeri vuoi: ");
        int N = scanner.nextInt();
        List<Integer> lista = listaRandom(N);
        System.out.println(lista);
        List<Integer> nuovalista = nuovaLista(lista);
        System.out.println(nuovalista);
        System.out.println("Numeri pari:");
        stampa(lista, true);
        System.out.println("Numeri dispari:");
        stampa(lista, false);


    }

    public static List<Integer> listaRandom(int N) {
        List<Integer> listaRandom = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            listaRandom.add(random.nextInt(101));
        }
        Collections.sort(listaRandom);
        return listaRandom;
    }

    public static List<Integer> nuovaLista(List<Integer> lista) {
        List<Integer> listaDuplicata = new ArrayList<>(lista);
        Collections.reverse(listaDuplicata);
        lista.addAll(listaDuplicata);
        return lista;
    }
    public static void stampa(List<Integer> lista, boolean pari) {
        for (int numero : lista) {
            if (pari && numero % 2 == 0) {
                System.out.println(numero);
            } else if (!pari && numero % 2 != 0) {
                System.out.println(numero);
            }
        }
    }
}
