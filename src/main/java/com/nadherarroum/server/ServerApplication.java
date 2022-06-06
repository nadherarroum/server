package com.nadherarroum.server;

import com.nadherarroum.server.enumeration.Status;
import com.nadherarroum.server.model.Server;
import com.nadherarroum.server.repo.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Bean
	CommandLineRunner run (ServerRepo serverRepo){
		return args -> {
			serverRepo.save(new Server(
					null, "192.168.1.8",
					"Ubuntu Linux", "8 GB",
					"Personal PC", "http://localhost:8090/server/image/server1.png",
					Status.SERVER_UP)
			);
			serverRepo.save(new Server(
					null, "192.168.1.5",
					"Android", "3 GB",
					"Smart Server", "http://localhost:8090/server/image/server2.png",
					Status.SERVER_UP)
			);
			serverRepo.save(new Server(
					null, "192.168.1.4",
					"Windows", "16 GB",
					"Personal PC", "http://localhost:8090/server/image/server3.png",
					Status.SERVER_UP)
			);
			serverRepo.save(new Server(
					null, "192.168.1.32",
					"Windows", "32 GB",
					"Mailing Server", "http://localhost:8090/server/image/server4.png",
					Status.SERVER_UP)
			);
		};
	}

}
