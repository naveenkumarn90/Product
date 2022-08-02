package com.example.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.product.entity.Product;
import com.example.product.service.ProductService;


@RestController
@RequestMapping("/product")

public class ProductController {
	@Autowired
	private ProductService prodService;
	
	@GetMapping("/prodList")
	public List<Product> findAll(){
		return prodService.findAll();
	}
	@GetMapping("/emp/{empId}")
	public Product findById(@PathVariable Integer prodId) throws Exception {
		Product p = prodService.findById(prodId);

		if (p == null)
			throw new Exception("Emp ID : " + prodId + " details not available in Repository..");

		return p;
	}

	@PostMapping("/saveEmployee")
	public String saveProduct(@RequestBody Product prod) {
		prod.setId(0);
		prodService.saveOrUpdate(prod);

		return "Product details added successfully!!!";
	}

	@PutMapping("/updateProduct")
	public String updateEmployee(@RequestBody Product prod) throws Exception {
	
		
		prodService.saveOrUpdate(prod);
		
		return "Employee ID : "+ prod.getId() + " Details updated Succesfully !!"; 
	}

	@DeleteMapping("emp/{id}")
	public String deleteById(@PathVariable int id) {
		prodService.deleteById(id);
		return "Employee ID : " + id +"details  deleted !!!";
	}
	
	

}
