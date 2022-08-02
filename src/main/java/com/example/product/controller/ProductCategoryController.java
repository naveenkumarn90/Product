package com.example.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.product.entity.Product;
import com.example.product.entity.ProductCategory;
import com.example.product.service.ProductCategoryService;

@Controller
@RequestMapping("/productcategory")
public class ProductCategoryController {
	@Autowired
	private ProductCategoryService productcategoryService;
	
	@GetMapping("/prodList")
	public List<ProductCategory> findAll(){
		return productcategoryService.findAll();
	}
	@GetMapping("/prod/{categoryId}")
	public ProductCategory findById(@PathVariable Integer categoryid) throws Exception {
		ProductCategory p = productcategoryService.findById(categoryid);

		if (p == null)
			throw new Exception("Emp ID : " + categoryid + " details not available in Repository..");

		return p;
	}

	@PostMapping("/saveCategory")
	public String saveProduct(@RequestBody Product prod) {
		prod.setId(0);
		productcategoryService.saveOrUpdate(null);

		return "Product details added successfully!!!";
	}

	@PutMapping("/updateProduct")
	public String updateProduct(@RequestBody Product prod) throws Exception {
	
		
		productcategoryService.saveOrUpdate(null);
		
		return "Category ID : "+ prod.getId() + " Details updated Succesfully !!"; 
	}

	@DeleteMapping("category/{id}")
	public String deleteById(@PathVariable int id) {
		productcategoryService.deleteById(id);
		return "category ID : " + id +"details  deleted !!!";
	}
	
	
	

}
