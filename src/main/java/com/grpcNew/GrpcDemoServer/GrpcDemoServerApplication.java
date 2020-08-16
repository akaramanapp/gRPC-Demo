package com.grpcNew.GrpcDemoServer;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class GrpcDemoServerApplication {

	public static void main(String[] args) throws IOException, InterruptedException {

		SpringApplication.run(GrpcDemoServerApplication.class, args);
		Server server = ServerBuilder.forPort(9090).addService(

				new UserService()).build();

		server.start();
		System.out.println("server started at " + server.getPort());
		server.awaitTermination();
	}

}
