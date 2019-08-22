package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductRepository;
import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductRepository productRepository;
	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub
		productRepository.delete(id);
	}

	@Override
	public void add(Product p) {
		// TODO Auto-generated method stub
		productRepository.save(p);
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}
	

	@Override
	public List<Product> getAllProductByName(String name) {
		// TODO Auto-generated method stub
		return productRepository.findByName(name);
	}

	@Override
	public void updateProduct(Product p) {
		// TODO Auto-generated method stub
		Product product = productRepository.getOne(p.getId());
		product.setName(p.getName());
		product.setPrice(150000);
		productRepository.save(product);
	}
	
}
