package nicolas.M4S1G1;

import nicolas.M4S1G1.entities.Menu;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApplicazioneMenu {

	public static void main(String[] args) {
		SpringApplication.run(ApplicazioneMenu.class, args);
	}

	@Bean
	public CommandLineRunner run(ApplicationContext ctx) {
		return args -> {
			Menu menu = (Menu) ctx.getBean("menu");
			System.out.println(menu.toString());
		};
	}
}
