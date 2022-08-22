package com.nccapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nccapp.bean.Ncc;
import com.nccapp.service.INccService;


@SpringBootApplication
public class SpringNccJdbcbasicApplication implements CommandLineRunner {

	
	public static void main(String[] args) {
		SpringApplication.run(SpringNccJdbcbasicApplication.class, args);
	}
    @Autowired
    INccService iNccService;
	@Override
	public void run(String... args) throws Exception {
		Ncc ncc = new Ncc("jack", "soilder", "army", 10, 2);
		iNccService.getAll().forEach(System.out::println);
	}

	
//	@Autowired
//	INccService iNccService;
//	@Override
//	public void run(String... args) throws Exception {
//		
//           Ncc ncc = new Ncc( );
//           iNccService.add
//         
//           
//		   
//		   
//	}

}
