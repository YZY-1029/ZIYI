package com.example.demo.controller;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller  // 透過標註 讓spring對於這個來說是一個controller
public class HelloController {
	@GetMapping("/hello")
	@ResponseBody   //回應純文字資料  // 回應給錢對ㄉ就是我return裡面的內容
	public String hello() {
		return " Hello " + new Date();
	}
	
	@GetMapping("/hi")
	@ResponseBody
	public String hi() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return "Hi " + formatter.format(new Date());
	}	
	
	@GetMapping("/welcome")
	public String welcome(Model model) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
// model 裡面放的就是要傳給 jsp 的資料, 相當於前面ㄉResponseBody		
		model.addAttribute("name", "阿山哥");
		model.addAttribute("now",formatter.format(new Date()));
		return "welcome"; // 取welcome.jsp檔名的部分
	}
	
}
