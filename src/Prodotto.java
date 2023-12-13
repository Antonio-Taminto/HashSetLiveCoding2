import java.util.Objects;

public class Prodotto {
    private int id;
    private String nome;
    private double prezzo;

    public Prodotto(int id,String nome,double prezzo){
        this.id = id;
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prodotto prodotto = (Prodotto) o;
        return id == prodotto.id && Double.compare(prezzo, prodotto.prezzo) == 0 && Objects.equals(nome, prodotto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, prezzo);
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                '}';
    }
}
