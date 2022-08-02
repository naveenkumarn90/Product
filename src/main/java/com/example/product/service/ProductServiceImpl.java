package com.example.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.product.entity.Product;
import com.example.product.repository.ProductRepository;

public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	
	public void saveOrUpdate(Product prod) {
		// TODO Auto-generated method stub
		repository.saveOrUpdate(prod);
	}

	@Override
	public void deleteById(int prodId) {
		// TODO Auto-generated method stub
		repository.deleteById(prodId);
		
	}
	
	

}
