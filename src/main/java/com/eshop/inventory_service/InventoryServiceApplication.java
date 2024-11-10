package com.eshop.inventory_service;

import com.eshop.inventory_service.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InventoryServiceApplication {
	private static final Logger logger = LoggerFactory.getLogger(InventoryServiceApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
		logger.info("Welcome to the inventory micro service");
		//System.out.println("Welcome to the inventory service");
	}

}
