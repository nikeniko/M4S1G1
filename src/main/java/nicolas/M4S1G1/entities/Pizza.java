package nicolas.M4S1G1.entities;

import nicolas.M4S1G1.exdenders.Ingrediente;
import java.util.ArrayList;
import java.util.List;

public class Pizza extends MenuOggetti {
    private List<Ingrediente> ingredienti;

    public Pizza(String nome, double prezzoBase, int kcalBase) {
        super(nome, prezzoBase, kcalBase);
        this.ingredienti = new ArrayList<>();
    }

    public void addIngrediente(Ingrediente ingrediente) {
        this.ingredienti.add(ingrediente);
    }

    @Override
    public double getPrezzo() {
        double prezzoTotale = super.getPrezzo();
        for (Ingrediente ingrediente : ingredienti) {
            prezzoTotale += ingrediente.getPrezzo();
        }
        return prezzoTotale;
    }

    @Override
    public int getKcal() {
        int kcalTotale = super.getKcal();
        for (Ingrediente ingrediente : ingredienti) {
            kcalTotale += ingrediente.getKcal();
        }
        return kcalTotale;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(getNome() + ":\n");
        sb.append("Ingredienti: ");
        for (Ingrediente ingrediente : ingredienti) {
            sb.append(ingrediente.getNome()).append(", ");
        }
        sb.setLength(sb.length() - 2); // Rimuove l'ultima virgola e spazio
        sb.append("\n");
        sb.append("Calorie: ").append(getKcal()).append(" kcal\n");
        sb.append("Prezzo: €").append(String.format("%.2f", getPrezzo()));
        return sb.toString();
    }
}
