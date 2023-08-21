package com.poly.service;

import java.util.List;

import com.poly.entity.Product;

public interface ProductService {
	
	List<Product> findAll();
	
	Product findById(Integer id);

	List<Product> findByName(String name);
	
	// tìm kiếm theo giá
	List<Product> findByPrice(String price);

	Product create(Product product);

	Product update(Product product);

	void delete(Integer id);

	List<Product> findByCategory(String cid);

}
