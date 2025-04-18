package servlet;

import model.CoffeeOrder;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.coyote.RequestGroupInfo;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CoffeeOrder")
public class CoffeeOrderServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//設定編碼
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		//取得參數
		String type = req.getParameter("type");
		String size = req.getParameter("size");
		String sugar = req.getParameter("sugar");
		//判斷參數
		if(type == null || size == null || sugar == null) {
			resp.getWriter().print("參數輸入不正確");
			return;
		}
		//進行商業邏輯
		CoffeeOrder coffeeOrder = new CoffeeOrder(type, size, sugar);
		resp.getWriter().print(coffeeOrder.getInfo());
		//建立分派器
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/coffee_order.jsp");
		req.setAttribute("coffeeOrder", coffeeOrder);
		rd.forward(req, resp);
		
		
	}
}
//Latte,Mocha,Americano,Cappuccino
