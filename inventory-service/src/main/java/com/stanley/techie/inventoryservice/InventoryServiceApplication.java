package com.stanley.techie.inventoryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableEurekaClient
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
//		return args -> {
//			Inventory inventory = new Inventory();
//			inventory.setSkuCode("iphone_15");
//			inventory.setQuantity(100);
//
//			Inventory inventory1 = new Inventory();
//			inventory1.setSkuCode("iphone_15_blue");
//			inventory1.setQuantity(0);
//
//			inventoryRepository.save(inventory);
//			inventoryRepository.save(inventory1);
//		};
//	}

}
