package com.example.product.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.product.entity.Product;

public class ProductRepositoryImpl implements ProductRepository {

	@Autowired
	EntityManager entityManager;
	
	
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Product> query =   currentSession.createQuery("select * from Product ",Product.class );
		List<Product> prodList = query.getResultList();
		return prodList;
	}

	
	public Product findById(int id) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		return currentSession.get(Product.class, id);
	}

	
	public void saveOrUpdate(Product prod) {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(prod);
		
	}

	
	public void deleteById(int prodId) {
		// TODO Auto-generated method stub
		Session currentSession  = entityManager.unwrap(Session.class);
		Query<Product> query = currentSession.createQuery("delete from Product where id = :productId");
		query.setParameter("productId",prodId );
		query.executeUpdate();
		
	}

}
