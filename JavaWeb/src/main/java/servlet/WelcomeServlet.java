package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/welcome")  //給子分業設定子網址
public class WelcomeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//設定編碼
		resp.setCharacterEncoding("UTF-8");  //告訴Servlet我的編碼方式是 UTF-8
		resp.setContentType("text/html;charset=UTF-8");  //告訴瀏覽器我裡面的編碼方式是 UTF-8(萬國碼
		
		//接收參數
		//例如: http://localhost:8080/JavaWeb/welcome?name=Jack&age=17
		String name = req.getParameter("name");  //因為要讓參數在網址內,所以這段參數他是req
		String age = req.getParameter("age");
		
		//檢查age是否為int
		if(isNumber(age)) {
			String message = Integer.parseInt(age) >= 18 ?"成年":"未成年";
			resp.getWriter().print(name+"歡迎光臨(" + age + "歲" + message +")");
		}else
			resp.getWriter().print(name+"歡迎光鈴");
		
		//判斷是否是數字
		private boolean isNumber(String data) {
			try {
				Integer.paraInt(data);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		//使用正則表示式
		private boolean isNumber2(String age) {
			
			
		}
		
		
		
		
		//String message = Integer.parseInt(age) >=18?"成年":"未成年";
		//resp.getWriter().println(name+"歡迎光臨(" + age + "歲)");
	}
}
