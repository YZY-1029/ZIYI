package cart.controller;

import java.io.IOException;

import cart.service.ProductService;
import cart.service.impl.ProductListServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/product/list")
public class ProductListServlet extends HttpServlet {

	
	private ProductService ss = new ProductListServiceImpl();
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		
		// 取得所有商品
		req.setAttribute("ss", ss.findAllProducts());
		req.getRequestDispatcher("/WEB-INF/view/cart/product_list.jsp").forward(req, resp);
		
	}

	
}