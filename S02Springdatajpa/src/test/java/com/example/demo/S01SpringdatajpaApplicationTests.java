package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;

@SpringBootTest
class S01SpringdatajpaApplicationTests {

	@Autowired
	ApplicationContext context;

	@Test
	void contextLoads() {
	}

	@Test
	void saveProduct() {
		ProductRepository repo = context.getBean(ProductRepository.class);

		Product product = new Product();
		product.setName("Mouse");
		product.setDescription("Bluetooth Mouse");
		product.setPrice(55000);

		repo.save(product);

	}

	@Test
	void readProduct() {
		ProductRepository repo = context.getBean(ProductRepository.class);

		Optional<Product> optionalproduct = repo.findById(1);

		if (optionalproduct.isPresent()) {
			Product product = optionalproduct.get();
			System.out.println(product);
		}

	}

	@Test
	void deleteProduct() {
		ProductRepository repo = context.getBean(ProductRepository.class);

		repo.deleteById(2);

	}

	@Test
	void findByName() {
		ProductRepository repo = context.getBean(ProductRepository.class);

		List<Product> products = repo.findByName("Mouse");
		System.out.println(products);
	}

	@Test
	void updateProduct() {
		ProductRepository repo = context.getBean(ProductRepository.class);
		Product product = null;
		Optional<Product> optionalproduct = repo.findById(4);

		if (optionalproduct.isPresent()) {
			product = optionalproduct.get();
			System.out.println(product);
		}
		
		if(product != null) {
			product.setPrice(5000);
			repo.save(product);
		}
		

	}

}
