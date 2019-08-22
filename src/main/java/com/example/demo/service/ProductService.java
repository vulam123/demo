package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.ProductRepository;
import com.example.demo.model.Product;

public interface ProductService {
	public void remove(Long id)  ;
	public void add(Product p);
	public List<Product> getAllProduct();
	public List<Product> getAllProductByName(String name);
	public void updateProduct(Product p);
}
