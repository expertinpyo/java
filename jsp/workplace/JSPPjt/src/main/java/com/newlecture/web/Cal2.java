package com.newlecture.web;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(asyncSupported = true, urlPatterns = { "/cal2" })
public class Cal2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext application = request.getServletContext(); // application 저장소, ServletContext 선언, 전역으로 값 저장 가능
		HttpSession session = request.getSession();	// session 객체 선언
		Cookie[] cookies = request.getCookies(); // 쿠키는 배열로 옴
		
		
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String v_ = request.getParameter("x");
		String op = request.getParameter("operator");
		
		
		int v = 0;
		
		if(!v_.equals("")) v = Integer.parseInt(v_);
		
		if(op.equals("=")) {
			// 값을 계산한다!
			
//			int x = (Integer)application.getAttribute("value"); // 앞에서 자장한 값
//			int x = (Integer)session.getAttribute("value"); // 앞에서 자장한 값
			int x = 0;
			for(Cookie c:cookies) {
				if(c.getName().equals("value")) {
					x = Integer.parseInt(c.getValue());
					break;
				}
			}
			
			
			
			int y = v; // 사용자가 지금 입력한 값
//			String operator = (String)application.getAttribute("op");
//			String operator = (String)session.getAttribute("op");
			
			String operator = "";
			for(Cookie c:cookies) {
				if(c.getName().equals("op")) {
					operator = c.getValue();
					break;
				}
			}
			
			int result = 0;	
			
			if(operator.equals("+")) {
				result = x + y;
			} else {
				result = x - y;
			}
			response.getWriter().printf("result : %d", result);
			
		} else {
			// 값을 저장한다!
//			application.setAttribute("value", v);
//			application.setAttribute("op", op);
//			session.setAttribute("value", v);
//			session.setAttribute("op", op);
			
			Cookie valueCookie = new Cookie("value", String.valueOf(v));
			Cookie opCookie = new Cookie("op", op);
			
			valueCookie.setPath("/cal2"); // 해당 url이 포함된 url에 대한 쿠키를 가져와라.(setPath)
			valueCookie.setMaxAge(60*60); // 만료 날짜를 설정할 수 있음. 초 단위
			opCookie.setPath("/cal2");
			
			response.addCookie(valueCookie);
			response.addCookie(opCookie); // 쿠키 클라이언트에게 전달
			
			response.sendRedirect("cal2.html");
		}
		
		
		
		
		
		
	}

}
