import java.util.*;

public class Main {
    public static void main(String[] args) {
        Prodotto prodotto1 = new Prodotto(1,"prodotto",10);
        Prodotto prodotto2 = new Prodotto(1,"prodotto",10);
        Prodotto prodotto3 = new Prodotto(1,"prodotto1",10);
        Prodotto prodotto4 = new Prodotto(1,"prodotto1",10);

        List<Prodotto> lista = new ArrayList<>();
        lista.add(prodotto1);
        lista.add(prodotto2);
        lista.add(prodotto3);
        lista.add(prodotto4);
        lista.add(prodotto1);

        GestioneOggettiUnici listaProdotti = new GestioneOggettiUnici(lista);

        for(Prodotto prodotto : listaProdotti.getLista()){
            System.out.println(prodotto.toString());
        }

        System.out.println();

        for(Prodotto prodotto : listaProdotti.rimuoviDuplicati()){
            System.out.println(prodotto.toString());
        }

    }

}