import java.util.*;

public class GestioneOggettiUnici {

    private List<Prodotto> lista;

    public GestioneOggettiUnici(List<Prodotto> lista) {
        this.lista = lista;
    }

    public List<Prodotto> getLista() {
        return lista;
    }

    public void setLista(List<Prodotto> lista) {
        this.lista = lista;
    }

    public List<Prodotto> rimuoviDuplicati(){

        Set<Prodotto> listaHash = new HashSet<>(lista);

        List<Prodotto> listaNoDuplicati = new ArrayList<>(listaHash);

        return listaNoDuplicati;
    }
}
