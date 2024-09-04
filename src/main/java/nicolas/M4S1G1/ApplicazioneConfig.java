package nicolas.M4S1G1;

import nicolas.M4S1G1.exdenders.Bevanda;
import nicolas.M4S1G1.exdenders.Ingrediente;
import nicolas.M4S1G1.entities.Pizza;
import nicolas.M4S1G1.entities.Menu;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicazioneConfig {

    @Bean
    public Ingrediente mozzarella() {
        return new Ingrediente("Mozzarella", 0.5, 80);
    }

    @Bean
    public Ingrediente pomodoro() {
        return new Ingrediente("Pomodoro", 0.5, 20);
    }

    @Bean
    public Ingrediente funghi() {
        return new Ingrediente("Funghi", 1.0, 15);
    }

    @Bean
    public Ingrediente salame() {
        return new Ingrediente("Salame", 1.5, 200);
    }

    @Bean
    public Pizza margherita() {
        Pizza pizza = new Pizza("Margherita", 5.0, 250);
        pizza.addIngrediente(mozzarella());
        pizza.addIngrediente(pomodoro());
        return pizza;
    }

    @Bean
    public Pizza capricciosa() {
        Pizza pizza = new Pizza("Capricciosa", 7.0, 300);
        pizza.addIngrediente(mozzarella());
        pizza.addIngrediente(pomodoro());
        pizza.addIngrediente(funghi());
        pizza.addIngrediente(salame());
        return pizza;
    }

    @Bean
    public Bevanda cola() {
        return new Bevanda("Coca Cola", 2.0, 150);
    }

    @Bean
    public Bevanda acqua() {
        return new Bevanda("Acqua", 1.0, 0);
    }

    @Bean
    public Menu menu() {
        Menu menu = new Menu();
        menu.addOggetto(margherita());
        menu.addOggetto(capricciosa());
        menu.addOggetto(cola());
        menu.addOggetto(acqua());
        return menu;
    }
}
