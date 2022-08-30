package com.newlecture.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/spag")
public class Spag extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num = 0;
		String num_ = request.getParameter("n");
		if(num_!=null && !num_.equals(""))
			num = Integer.parseInt(num_);
		String model = "";
		if(num%2 != 0)
			model = "홀수";
		else
			model = "짝수";
		
		//redirect 현재 작업하는 내용과 관계없이 새로운 것을 보냄
		
		request.setAttribute("model", model);
		
		String[] names = {"newlec", "dragon", "inpyo"};
		request.setAttribute("names", names);
		
		Map<String, Object> notice = new HashMap<String, Object>();
		notice.put("id", 1);
		notice.put("title", "제목입니다.");
		request.setAttribute("notice", notice);
		
		//forward 현재 작업하던 내용을 보내는 것
		RequestDispatcher dispatcher = request.getRequestDispatcher("spag.jsp");
		dispatcher.forward(request, response); // request가 일종의 저장소 역할을 해 model 데이터를 jsp로 보낼 수 있게 함
		
	}	
}
