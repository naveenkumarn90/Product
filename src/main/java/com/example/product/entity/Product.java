package com.example.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")

public class Product {
	@Id
	@Column(name="Id")
	private int id;
	
	@Column(name="sKu")
	private String sku;
	
	public Product(int id, String sku, String name, float unitprice, String imageurl, int unitsinstock,
			String datecreated, String lastupdated, int categoryid) {
		super();
		this.id = id;
		this.sku = sku;
		this.name = name;
		this.unitprice = unitprice;
		this.imageurl = imageurl;
		this.unitsinstock = unitsinstock;
		this.datecreated = datecreated;
		this.lastupdated = lastupdated;
		this.categoryid = categoryid;
	}

	@Column(name="Name")
	private String name ;
	
	@Column(name="unitPrice")
	private float unitprice ;
	
	@Column(name="imageURL")
	private String imageurl ;
	
	@Column(name="unitsInStock")
	private int unitsinstock ;
	
	@Column(name="dateCreated")
	private String datecreated ;
	
	@Column(name="lastUpdated")
	private String lastupdated ;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(float unitprice) {
		this.unitprice = unitprice;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public int getUnitsinstock() {
		return unitsinstock;
	}

	public void setUnitsinstock(int unitsinstock) {
		this.unitsinstock = unitsinstock;
	}

	public String getDatecreated() {
		return datecreated;
	}

	public void setDatecreated(String datecreated) {
		this.datecreated = datecreated;
	}

	public String getLastupdated() {
		return lastupdated;
	}

	public void setLastupdated(String lastupdated) {
		this.lastupdated = lastupdated;
	}

	public int getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

	@Column(name="categoryId")
	private int categoryid;

}
