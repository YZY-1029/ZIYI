package servlet;

import java.io.IOException;
import java.net.Authenticator.RequestorType;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Guestbook;
@WebServlet("/guestbook")
public class GuestbookServlet extends HttpServlet{
	//記錄所有留言資料
	private static final List<Guestbook> guestbooks = new CopyOnWriteArrayList<>();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/guestbook_form.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String message = req.getParameter("message");// 取得表單中的留言內容
		// 建立guestbook物件
		Guestbook guestbook = new Guestbook(message);
		// 加入到guestbooks集合中
		guestbooks.add(guestbook);
		// 重導到/WEB-INF/guestbook_result.jsp
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/guestbook_form.jsp");
		req.setAttribute("message", message);// 本次留言
		req.setAttribute("guestbooks", guestbooks);// 歷史留言
		rd.forward(req, resp);
		
		
	}

	
	
}
