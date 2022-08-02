package com.example.product.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.product.entity.Product;
import com.example.product.entity.ProductCategory;

public class ProductCategoryRepositoryImpl implements ProductCategoryRepository{

	@Autowired
	EntityManager entityManager;
	
	
	public List<ProductCategory> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<ProductCategory> query =   currentSession.createQuery("select * from ProductCategory ",ProductCategory.class );
		List<ProductCategory> productcategoryList = query.getResultList();
		return productcategoryList;
	}

	
	public ProductCategory findById(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		return currentSession.get(ProductCategory.class, id);
	}



	public void deleteById(int categoryid) {
		Session currentSession  = entityManager.unwrap(Session.class);
		Query<ProductCategory> query = currentSession.createQuery("delete from ProductCategory where id = :categoryid");
		query.setParameter("categoryid",categoryid );
		query.executeUpdate();
	}


	public void saveOrUpdate(ProductCategory prod) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(entityManager);
	}

}
