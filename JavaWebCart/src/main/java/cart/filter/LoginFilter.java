package cart.filter;

import java.io.IOException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebFilter(urlPatterns = {"/user/list", "/product/list"})
public class LoginFilter extends HttpFilter {

	@Override
	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
	// 跟具 session 屬性是否有 userDTO 物件來判斷是否已經登入 
	HttpSession session = request.getSession();
	if(session.getAttribute("userDTO") == null) {
		// 重倒到登入葉面
		response.sendRedirect("/JavaWebCart/user/login");
		
	     
	/*	// 給 result.jsp ㄉ資訊
		request.setAttribute("resultTitle", "請先登入");
		request.setAttribute("resultMessage", "請先登入");
		// 重導到 result.jsp
		request.getRequestDispatcher("/WEB-INF/view/cart/result.jsp").forward(request, response);
	*/
	}else {
		// By pass
		chain.doFilter(request, response);
	}
	
	
	
		
	}

	
	
	
}
