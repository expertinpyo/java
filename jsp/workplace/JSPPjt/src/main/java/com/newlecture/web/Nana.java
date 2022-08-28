package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi") // Annotation 설정
public class Nana extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding("UTF-8"); // 인코딩 방식 UTF-8로 변경
		response.setContentType("text/html; charset=UTF-8"); // 사용자가 어떻게 해석해야 하는지, char = UTF-8 // html 문서임을 명시
		PrintWriter out = response.getWriter();
		
		String cnt_ = request.getParameter("cnt");
		int cnt = 1;
		if(cnt_ != null && !cnt_.equals("")) {
			cnt = Integer.parseInt(cnt_);
		}
		
		for(int i=0;i<cnt;i++) {
			out.println((i+1)+": Hello ich bin Inpyo 하하<br>");
			
		}
		
		
	}
}
