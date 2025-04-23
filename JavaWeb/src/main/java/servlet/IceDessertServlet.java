package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Guestbook;
/*
//冰果店
@WebServlet("/ice")
public class IceDessertServlet extends HttpServlet {
	private static final ArrayList<bowl> bowls = new ArrayList<>();
	
	@Override //導到甜點的表單
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/ice_dessert_form.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 取得主餐內容
		String mainDish = req.getParameter("mainDish");
		// 取得配料內容
		String[] toppings = req.getParameterValues("toppings");
		
		bowl mybowl = new bowl(mainDish, toppings); 
		
		bowls.add(mybowl);
		
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/icd_result.jsp");
		req.setAttribute("mainDish", mainDish);
		req.setAttribute("toppings", toppings);
		rd.forward(req, resp);
	}
	
	public class bowl{
		private String mainDish;
		private String[] toppings;
		private int totalPrice;
		
		public String getMainDish() {
			return mainDish;
		}
		public String[] getToppings() {
			return toppings;
		}
		
		
		public int getTotalPrice() {
			return totalPrice;
		}
		public bowl(String mainDish, String[] toppings) {
			this.mainDish = mainDish;
			this.toppings = toppings;
		}
		
		

	
		
	}
}
*/