package nicolas.M4S1G1.entities;

public abstract class MenuOggetti {
    private String nome;
    private double prezzo;
    private int kcal;

    public MenuOggetti(String nome, double prezzo, int kcal) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.kcal = kcal;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public int getKcal() {
        return kcal;
    }

    @Override
    public String toString() {
        return nome + " - €" + String.format("%.2f", prezzo) + " - " + kcal + " kcal";
    }
}
