package by.kasyan.belarusbankBotTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;

@SpringBootApplication
public class BelarusbankBotTestApplication {

	public static void main(String[] args) {
		ApiContextInitializer.init();
		SpringApplication.run(BelarusbankBotTestApplication.class, args);
	}

}
