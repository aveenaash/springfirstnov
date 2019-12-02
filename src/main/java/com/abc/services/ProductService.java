package com.abc.services;

import org.springframework.stereotype.Service;

import com.abc.dto.ProductDto;

@Service
public class ProductService {

	public ProductDto giveDemoProduct() {
		ProductDto p = new ProductDto();
		p.setName("Iphone 11");
		p.setCategory("Phone & Tablets");
		p.setDescription("thi is the new iphone");
		
		return p;
	}
	
}
