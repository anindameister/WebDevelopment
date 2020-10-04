package fr.telecom_st_etienne.fx.series;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration
@ComponentScan(basePackages = "fr.telecom_st_etienne.fx.series")
@EnableJpaRepositories(basePackages = "fr.telecom_st_etienne.fx.series", entityManagerFactoryRef = "entityManagerFactory")
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}