package com.example.product.repository;

import java.util.List;

import com.example.product.entity.Product;
import com.example.product.entity.ProductCategory;

public interface ProductCategoryRepository {
	public List<ProductCategory> findAll();
	public ProductCategory findById(int id);
	public void saveOrUpdate(ProductCategory prod);
	public void deleteById(int categoryid);

}
