package cart.service.impl;

import java.util.List;

import cart.dao.ProductDAO;
import cart.dao.impl.ProductDAOImpl;
import cart.model.dto.ProductDTO;
import cart.model.dto.UserDTO;
import cart.model.entity.Product;
import cart.model.entity.User;
import cart.service.ProductService;

public class ProductListServiceImpl implements ProductService {

	private ProductDAO productListDAO = new ProductDAOImpl();
	
	@Override
	public List<ProductDTO> findAllProducts() {
		// 1.從 productListDAO 取得 List<product>
		List<Product> products = productListDAO.findAllProducts();
		
		// 2.將 List<Product> 每一個元素由 Product 轉成 ProductDTO 使之變成 List<ProductDTO>
		List<ProductDTO> ProductDTOs = products.stream()
									  .map(product -> {
										  ProductDTO productDTO = new ProductDTO();
										  
										  productDTO.setProductId(product.getProductId());
										  productDTO.setProductName(product.getProductName());
										  productDTO.setPrice(product.getPrice());
										  productDTO.setQty(product.getQty());
										  productDTO.setTotal(product.getPrice()*product.getQty());
										  return productDTO;
									  })
									  .toList();
		
	//	System.out.println(ProductDTOs);
		return ProductDTOs;
		
	}

	@Override
	public void add(String productName, String price, String qty, String productImageBase64) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer productId) {
		// TODO Auto-generated method stub
		
	}

}
