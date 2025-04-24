package service;

import java.util.ArrayList;
import java.util.List;

import dao.ProductDAO;
import model.dto.ProductDTO;
import model.entity.Product;

public class ProductService {
	private ProductDAO productDAO = new ProductDAO();
	
	public List<ProductDTO> findAll(){
		List<Product> products = productDAO.findAll();
		List<ProductDTO> productDTOs = new ArrayList<>();
		for (Product product : products) {
			productDTOs.add(new ProductDTO(product.getItem(), product.getPrice()));
		}
		return productDTOs;
	}
	
	public ProductDTO getProductDTO(String item) {
		Product product = productDAO.getProduct(item);
		return new ProductDTO(product.getItem(),product.getPrice());
	}
	//根據message取的資訊
	public Integer getPrice(String message) {
		return productDAO.findAll()
						 .stream()		
						 .filter( p -> message.contains(p.getItem()))    //模糊比對
						 .findFirst()      // 因為.findFirst()會回傳一個Option<T>
						 .get()            // 所以需要用.get()把Optional<Product>直接取值
						 .getPrice();      //最後getprice
	}
	
}
