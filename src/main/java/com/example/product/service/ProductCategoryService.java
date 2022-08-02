package com.example.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.product.service.ProductCategoryService;
import com.example.product.entity.ProductCategory;

@Service
public interface ProductCategoryService {
	@Autowired
	public List<ProductCategory> findAll();
	public ProductCategory findById(int id);
	public void saveOrUpdate(ProductCategory prod);
	public void deleteById(int prodId);

}
