package nicolas.M4S1G1.entities;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MenuOggetti> oggetti;

    public Menu() {
        this.oggetti = new ArrayList<>();
    }

    public void addOggetto(MenuOggetti oggetto) {
        oggetti.add(oggetto);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Menu:\n");
        for (MenuOggetti oggetto : oggetti) {
            sb.append(oggetto.toString()).append("\n\n");
        }
        return sb.toString();
    }
}
