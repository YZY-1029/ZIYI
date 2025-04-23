package case04;

import java.io.IOException;
import java.net.http.HttpClient;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ice")
public class IceDessert extends HttpServlet {
	private static final List<IceOrder> iceOrders = new CopyOnWriteArrayList<>();
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/ice_dessert_form.jsp").forward(req, resp);
	}

	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		
		String mainDisName = req.getParameter("mainDish");
		String[] toppingArray = req.getParameterValues("toppings");
		
		//建立IceOrder
		IceOrder iceOrder = new IceOrder(mainDisName, toppingArray);
		//加入到訂單集合
		iceOrders.add(iceOrder);
		//重導到jsp
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/icd_result.jsp");
		req.setAttribute("iceOrders", iceOrders);
		rd.forward(req, resp);
		
/* 更精簡 req.setAttribute("iceOrders", iceOrders);
		req.getRequestDispatcher("/WEB-INF/icd_result.jsp").forward(req, resp);   */
	}



	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String deleteiceOrder = req.getParameter("box");
			
		if(deleteiceOrder != null) {
			iceOrders.remove(Integer.parseInt(deleteiceOrder));
		}else {
			
		}
		
		req.setAttribute("iceOrders", iceOrders);
		req.getRequestDispatcher("/WEB-INF/icd_result.jsp").forward(req, resp);
		
	}
	
	
	
}

