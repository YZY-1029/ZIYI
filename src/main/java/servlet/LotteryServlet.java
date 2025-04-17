package servlet;

import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/BINGO_GINGO_539")
public class LotteryServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// step1. 生成樂透號碼
		Random random = new Random();  //隨機取物件
		Set<Integer> box = new LinkedHashSet<>(); //放樂透號碼的容器
		
		while(box.size() < 5) {					 //放號碼球,五顆
			int number = random.nextInt(39) + 1; // 0~38 + 1
			box.add(number);                     //將number放進box裡面    
		}
		// step2. 生成調度器(分派器)
		RequestDispatcher rd = req.getRequestDispatcher("/lottery.jsp");
		// step3. 傳遞樂透號碼
		req.setAttribute("box", box); //裝配要傳遞ㄉ內容
		rd.forward(req, resp); //傳送給JSP
		
		
		//resp.getWriter().print(box); //透過resp將資料顯示在瀏覽器	//回應給網頁.的輸出資訊.要寫出box
		//System.out.println(box);  //醬子只有在console裡面會印出box
	}
}
// SSR 後端渲染  跟  前後端分離不一樣