package com.example.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.product.entity.Product;
import com.example.product.service.ProductService;

@Service
public interface ProductService {
	
	public List<Product> findAll();
	public Product findById(int id);
	public void saveOrUpdate(Product prod);
	public void deleteById(int prodId);

}
