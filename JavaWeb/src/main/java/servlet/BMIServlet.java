package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/bmi")
public class BMIServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		String h = req.getParameter("h");
		String w = req.getParameter("w");
		
		if(!(isDouble(h)||(isDouble(w)))) {
			resp.getWriter().println("身高體重輸入錯誤");
			return;
		}
		double height = Double.parseDouble(h);
		double weight = Double.parseDouble(w);
		double bmiValue = getBMIValue(height,weight);
		String result = getBMIExpression(bmiValue); 
		
		resp.getWriter().print("BMI值="+bmiValue+"("+result+")");
	}
	private double getBMIValue(double height, double weight) {
		return weight / Math.pow(height/100, 2);
	}
	private String getBMIExpression(double bmiValue) {
		return bmiValue <=18 ?"過輕" :(bmiValue>23)?"過重":"正常";
	}
	
	
	public static boolean isDouble(String data) {
		try {
			Double.parseDouble(data);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}	
