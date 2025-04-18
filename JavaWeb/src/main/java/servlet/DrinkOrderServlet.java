package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.DrinkOrder;

@WebServlet("/DrinkOrder")
public class DrinkOrderServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//設定編碼
				resp.setCharacterEncoding("UTF-8");
				resp.setContentType("text/html;charset=UTF-8");
		//取得參數
		String type = req.getParameter("type");
		String size = req.getParameter("size");
		String ice = req.getParameter("ice");	
		//判斷參數
		if(type==null||size==null||ice==null) {
			resp.getWriter().print("參數輸入錯誤");
			return;
		}
		//進行商業邏輯
		DrinkOrder drinking = new DrinkOrder(type,size,ice);
		resp.getWriter().print(drinking.infor());
		//建立分派器
		
	}
	
}
