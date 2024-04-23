package esercizio1;

import java.util.*;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci numero parole: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Set<String> parole = new HashSet<>();
        List<String> duplicati = new ArrayList<>();

        for(int i=1; i<=n; i++){
            System.out.println("Inserisci la parola: " + i);
            String parola = scanner.nextLine();
            if(!parole.add(parola)){
                duplicati.add(parola);
            }
        }

        System.out.println("Parole duplicate: " + duplicati);
        System.out.println("Numero di parole distinte " + parole.size());

        System.out.println("Elenco parole distinte");
        for (String parola: parole){
            System.out.println(parola);
        }
    }


}
