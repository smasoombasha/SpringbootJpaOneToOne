package com.OneToOne.demo;

import com.OneToOne.demo.Entity.Customer;
import com.OneToOne.demo.Entity.Product;
import com.OneToOne.demo.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class OneToOneDemoApplication implements CommandLineRunner {
	@Autowired
	CustomerRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(OneToOneDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Customer customer = new Customer();
		Customer customer1 = new Customer();
		//Product product = new Product();
		List<Product> product = new ArrayList<>();
		List<Product> product1 = new ArrayList<>();
		customer.setCname("Pawan kalyan");
		customer1.setCname("Masoom basha");
		//product.setpname("Benz Merceds");
		//customer.setProduct(product);
		product.add(new Product("Benz Merceds",2_000_000));
		product.add(new Product("Range Rover",4_000_000));
		product1.add(new Product("Range Rover",4_000_000));
		product1.add(new Product("Range Rover",4_000_000));
		customer.setProduct(product);
		customer1.setProduct(product1);
		repo.save(customer);
		repo.save(customer1);



	}
}
