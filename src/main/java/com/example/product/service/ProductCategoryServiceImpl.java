package com.example.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.product.entity.ProductCategory;
import com.example.product.repository.ProductCategoryRepository;
import com.example.product.repository.ProductRepository;

public class ProductCategoryServiceImpl implements ProductCategoryService {

	@Autowired
	private ProductCategoryRepository categoryrepository;

	public List<ProductCategory> findAll() {
		return categoryrepository.findAll();
	}

	public ProductCategory findById(int id) {
		return categoryrepository.findById(id);
	}

	public void saveOrUpdate(ProductCategory prod) {
		 categoryrepository.saveOrUpdate(prod );
	}

	public void deleteById(int prodId) {
		categoryrepository.deleteById(prodId); 
	}

}
