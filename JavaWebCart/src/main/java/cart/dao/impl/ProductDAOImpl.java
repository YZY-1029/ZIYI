package cart.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cart.dao.ProductDAO;
import cart.model.entity.Product;
import cart.model.entity.User;

public class ProductDAOImpl extends BaseDao implements ProductDAO {

	@Override
	public List<Product> findAllProducts() {
		List<Product> products = new ArrayList<Product>(); // 用來存放所有使用者的容器
		String sql = "select product_id, product_name, price, qty from product order by product_id ";
				try(Statement stmt = conn.createStatement();
						ResultSet pl = stmt.executeQuery(sql)) {
						// pl 裡面存放的是資料表的內容
						// 利用 pl.next() 逐筆取出資料
						while (pl.next()) {
							// 建立 User 物件來存放資料列每一個欄位的內容
							Product product = new Product();
							product.setProductId(pl.getInt("product_id"));
							product.setProductName(pl.getString("product_name"));
							product.setPrice(pl.getInt("price"));
							product.setQty(pl.getInt("qty"));
							// 注入到 users 集合中保存
							products.add(product);
						}
						
					} catch (SQLException e) {
						e.printStackTrace();
					}
					
					return products;
				}

	

	@Override
	public void add(Product product) {
		
		
	}

	@Override
	public void delete(Integer productId) {
		
	}

	
	
}
