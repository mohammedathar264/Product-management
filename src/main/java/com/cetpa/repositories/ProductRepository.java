package com.cetpa.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cetpa.models.Product;

@Repository
public class ProductRepository 
{
	private ArrayList<Product> productList=new ArrayList<Product>();

	public void saveProduct(Product product) 
	{
		productList.add(product);
	}

	public List<Product> getProductList() 
	{
		return productList;
	}
	public Product getProductRecord(int pid) 
	{
		for(Product product:productList)
		{
			if(product.getPid()==pid)
				return product;
		}
		return null;
	}

	public void deleteRecord(Product product) 
	{
		productList.remove(product);
	}

	public void updateRecord(Product producto, Product productn)
	{
		producto.setName(productn.getName());
		producto.setBrand(productn.getBrand());
		producto.setPrice(productn.getPrice());
	}
}
