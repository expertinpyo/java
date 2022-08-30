# JSP



- Servlet

  - Java 코드 안에 HTML 코드 (하나의 클래스)

  - data processing(Controller)에 좋다.

  - 즉 DB와의 통신, Business Logic 호출, 데이터를 읽고 확인하는 작업 등에 유용하다.

  - Servlet이 수정된 경우 Java 코드를 컴파일(.class 파일 생성)한 후 동적인 페이지를 처리하기 때문에 전체 코드를 업데이트하고 다시 컴파일한 후 재배포하는 작업이 필요하다. (개발 생산성 저하)

    

- JSP

  - HTML 코드 안에 Java 코드
  - presentation(View)에 좋다.
  - 즉 요청 결과를 나타내는 HTML 작성하는데 유용하다.
    JSP가 수정된 경우 재배포할 필요가 없이 WAS가 알아서 처리한다. (쉬운 배포)

출처 : https://gmlwjd9405.github.io/2018/11/04/servlet-vs-jsp.html



### 코드로 비교

#### servlet

~~~java
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

~~~



#### JSP

~~~jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%
String cnt_ = request.getParameter("cnt");
int cnt = 1;
if(cnt_ != null && !cnt_.equals("")) {
	cnt = Integer.parseInt(cnt_);
}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% for(int i=0; i<cnt; i++){%>
		
		안녕<br>
		<% }
	%>
</body>
</html>
~~~

java의 인코딩 부분을  jsp에서는 윗줄로 대체할 수 있음

또한, PrintWriter 클래스 인스턴스를 따로 선언하지 않아도 웹 상에서 원하는 문구를 바로 출력할 수 있다.



## JSP MVC model-1



코드블럭을 어떻게 하면 쉽게 만들 수 있을까?

유지 보수를 위해 입력 코드와 출력 코드를 분할하고자 한다!



입력과 제어를 담당 : Controller[자바 코드]

출력을 담당 : View[HTML 코드]



~~~ jsp
Controller 부분 (Django view)
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int num = 0;
	String num_ = request.getParameter("n");
	if(num_!=null && !num_.equals(""))
		num = Integer.parseInt(num_);
	String model = "";
	if(num%2 != 0)
		model = "홀수";
	else
		model = "짝수";
%>

View 부분 (Django template)
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%=model %> 입니다.
</body>
</html>
~~~



## JSP MVC model -2

model -1 

- controller와 view가 물리적으로 분리되지 않은 방식

model -2

- controller와 view가 물리적으로 분리된 방식
- Dispatcher를 집중화한 후의 모델
  - controller와 view를 연결(포워딩)하는 것 = dispatcher

서버 실행 시 view보다 controller가 우선순위를 가짐. why? 데이터를 주고받아야 하므로





## EL(Expression Language)

저장 객체에서 값을 추출해서 출력하는 표현식



~~~java
//Controller
request.setAttribute("cnt", 30);

//View
request.getAttribute("cnt")
    => View에서 java코드 쓰고싶지 않아!
    => ${cnt} : EL
    
// List를 보낸다면?
// controller
List list = new AttrayList(){"1", "test", ...}
request.setAttribute("list", list)

// View
((List)request.getAttribute("list")).get(0)
    => ${list[0]}

~~~



## EL의 데이터 저장소

서버 상의 4개의 저장소

- page
  - 페이지 내에서 pageContext.setAttribute() 한 값을 뽑아올 수 있음
- request
- session
- application



탐색 우선순위

page > request > session > application

=> Scope 키워드를 통해 해당 순위를 무시하고, 원하는 곳으로 바로 접근 가능

ex) pageScope / requestScope / sessionScope / applicationScope

${sessionScope.cnt}



param / header / cookie 등도 el을 통해 쉽게 알아낼 수 있음



## EL의 연산자



