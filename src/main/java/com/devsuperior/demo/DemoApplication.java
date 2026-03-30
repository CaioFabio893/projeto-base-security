package com.devsuperior.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class DemoApplication {

    // pra ver a senha
    // adicionar //implements CommandLineRunn  na DemoApplication
//    @Autowired
//    private PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


//quando quer descobri a senha para por no banco
//    @Override
//    public void run(String... args) throws Exception {
//        System.out.println("Encode = " + passwordEncoder.encode("123456"));
//    }


}
