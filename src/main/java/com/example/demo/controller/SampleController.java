package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;

@RestController
public class SampleController {

	List<Product> products = new ArrayList<>();

	@GetMapping(value = "/products")
	public List<Product> getProducts() {

		return products;
	}

	@PostMapping(value = "/product")
	public String addProduct(@RequestBody Product product) {
		products.add(product);
		return "success";
	}

	@GetMapping(value = "/product/{productid}")
	public Product getProductById(@PathVariable("productid")int id) {
		for (Product product : products) {
			if (product.getId() == id) {
				return product;
			}
		}
		return null;
	}

}
