package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//表示可以透過 http://localhost:8080/JavaWeb/aaaaa網址執行到此Servlet
//@WebServlet("/aaaaa")		//精簡配置寫法
//@WebServlet(urlPatterns = "/aaaaa")	//這比較標準寫法
@WebServlet(urlPatterns = { "/aaaaa","/bbbbb"})  //同一個網站但有兩種路徑一個是a一個是b可以來去分分辨從哪裡來的人比較多

public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().println("Hello JavaServlet");//將字串回應給瀏覽器
	
	}
	
	
}
