package com.zisal.cloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created on Feb 24, 2018
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@SpringBootApplication
@EnableConfigServer
public class ServerApplication {

    public static void main(String [] args) {
        SpringApplication.run(ServerApplication.class);
    }
}
