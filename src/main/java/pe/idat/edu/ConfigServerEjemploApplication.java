package pe.idat.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

//habilitar el config server
@EnableConfigServer
@SpringBootApplication
public class ConfigServerEjemploApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerEjemploApplication.class, args);
	}

}
