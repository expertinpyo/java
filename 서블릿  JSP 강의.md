# 서블릿 / JSP 강의



## 웹 서버

데이터 전송을 원활히 하기 위해 웹이 출현함

웹은 브라우저를 통해 Request를 하고

서버는 Response 할 수 있음



웹 프로그래밍 = 서버 클라이언트 프로그래밍을 웹에 얹을 수 있음

DB를 연동해 동적으로 응답할 수 있게끔 함



서버 환경

실행환경(Web Server) + WAS(Web Application Server)



웹 서버는 기본적으로 있음

사용자가 요구하는 내용이 동적인 내용 => 이를 진행하기 위한 코드를 실행할 수 있는 무언가 = > 이게 WAS



Servlet

=> Server Application Let, 서버 어플리케이션이 다소 조각났다



웹 => apache(Web Server) + tomcat(Web Container, WAS)

[Apache]

```
아파치 소프트웨어 재단의 오픈소스 프로젝트.
일명 웹서버로 불리며, 클라이언트 요청이 왔을때만 응답하는 정적 웹페이지에 사용.
웹서버 = 80번 포트로 클라이언트 요청(POST,GET,DELETE)이 왔을때만 응답함.
정적인 데이터만 처리한다.(HTML,CSS,이미지 등
```

[Tomcat]

```
dynamic(동적)인 웹을 만들기 위한 웹 컨테이너, 서블릿 컨테이너라고 불리며, 
웹서버에서 정적으로 처리해야할 데이터를 제외한 JSP, ASP, PHP 등은 웹 컨테이너(톰캣)에게 전달.
WAS(Web Application Server)
동적인 데이터 처리가 가능
DB연결,데이터 조작, 다른 응용프로그램과 상호 작용 가능
8080번 포트 사용
```

출처: https://byul91oh.tistory.com/65



## servlet이란?

Dynamic Web Page를 만들 때 사용되는 자바 기반의 웹 어플리케이션 프로그래밍 기술

웹 요청과 응답의 흐름을 간단한 메서드 호출만으로 체계적으로 다룰 수 있게 해주는 기술

자바 클래스로, 웹 어플리케이션을 작성 후 웹 서버안에 있는 웹 컨테이너에서 이 것을 실행하고, 웹 컨테이너에서는 servlet 인스턴스 생성 후 서버에서 실행되다가 웹 브라우저에서 서버에 Request하면 요청에 맞는 동작 수행 후 HTTP 형식으로 Response함.

MVC pattern 에서 Controller의 역할

Http 프로토컬 서비스를 지원하는 javax.servlet.http.HttpServlet 클래스를 상속받음.



### 서블릿 컨테이너란?

서블릿을 담고 관리해주는 컨테이너

구현외더있는 servlet 클래스의 규칙에 맞게 servlet을 관리해줌.

Client에서 request하면, 컨테이너는 HttpServletRequest, HtppServletResponse 두 객체를 생성. 그 후 POST, GET 여부에 따라 동적인 페이지를 생성하여 응답 보냄



출처 : https://coding-factory.tistory.com/742



## context

=> 웹을 세분화하는 것이라고 생각하면 됨

ex) 

root

- A
  - 서브A
  - 서브B
- B
- C
- D

... 이런 식으로 웹이 구성되어 있을 때, root 안에서 계속 A, B, C, D, .. 를 관리하는 것은 비효율적

따라서, 이를 쪼개서 관리하되, 각 요소(root - A 등)끼리는 연결되어 있는 것.



## Servlet

조각나있는 서버 어플리케이션

Java에서는 main 함수 대신, service 함수 선언함



Tomcat에서 web-inf(web info)내 파일들은 사용자에게 절대 전달되지 않음

따라서, 설정 등 외부에서 접근을 막고 싶은 정보는 web-inf안에 넣음





웹서버 + WAS는 클라이언트의 요청에 의한 값과 Java server application 내 값을 mapping 해두면 됨



## Annotation을 이용한 URL 매핑

Annotation : 클래스나 메서드에 붙여지는 일종의 주석

=> 일반 주석과는 다르게 컴파일러에 의해 사라지지 않는 주석임



.xml보다 Annotation을 사용하는 이유

=> 각자 분업화된 내용을 진행할 수 있으므로!



## 서블릿 출력 형식 설정 



하는 이유 : 형식이 지정되어있지 않으면 브라우저마다 자의적으로 문서 형태를 정함

(ex, Edge : HTML / Chrome : Text)

  

~~~java
response.setCharacterEncoding("UTF-8"); // 인코딩 방식 UTF-8로 변경
response.setContentType("text/html; charset=UTF-8"); // 사용자가 어떻게 해석해야 하는지, char = UTF-8 // html 문서임을 명시

~~~



## 사용자 요청 처리하기 - GET  요청과 쿼리 스트링

~~~
http://localhost/hello?cnt=3 
?cnt=3 => 쿼리 스트링. 추가적인 옵션을 요청하는 것

[요청예시]
http://localhost/hello?cnt=3 => "3"
http://localhost/hello?cnt=	=> ""
http://localhost/hello? => null
http://localhost/hello => null

입력값을 전달하지 않아도 오류가 나지 않게 하려면 기본값을 설정해줘야 함

~~~



## 사용자 요청 처리하기 - POST 요청과 쿼리 스트링

~~~ html
<form action="notice-reg">
		<div>
			<label>제목:</label>><input type="text" name="title">
		</div>
		<div>
			<label>내용:</label>><textarea name="content"></textarea>
		</div>
		<div>
			<input type="submit" value="submit!">
		</div>
</form>
~~~

이런 방식으로 title, content를 쿼리스트링으로 요청 보낼 수 있음



하지만

1. url의 길이 제한에 우리가 쓰고자 하는 내용이 짤릴 수 있으며
2. 쿼리 스트링은 달라고 하는 것이 문서라면, 일종의 옵션 값을 보내는 것일뿐, 내용 전체를 보내는 것은 아님

~~~html
<form action="notice-reg" method="POST">
		...
</form>
~~~



따라서, form 태그 안에 method = "POST"추가

=> 이렇게 되면 문서요청 body안에 따로 들어가게 됨

=> 장점으로, 크기 제한이 없음, 보안에 위배되지 않음(쿼리 셋으로 보내면 url에 전송하고자 하는 값이 다 들어가므로 위험)





이렇게 보내면 한글 깨짐 문제 발생함

why? 우리는 UTF-8(2바이트 인식 가능) 형식으로 요청 보내지만, 웹서버는 ISO-8859-1 형식(1 바이트 짜리를 하나로 인식)으로 인식함

따라서, request.setCharacterEncoding("UTF-8");을 통해, 서버에서 UTF-8로 읽는다고 선언해야 함.(Or Tomcat의 환경 설정을 변경, 추천되는 방법은 아님)



## 서블릿 필터

서블릿을 만들 때 마다  request.setCharacterEncoding("UTF-8"); 설정을 통해 한글을 사용할 수 있게끔 해야함

=> 너무 번거로움

=> 따라서, WAS와 Servlet 사이에 Filter를 만들어서 이 작업 가능케 함



추후, 인증과 권한 등에도 자주 쓰이는 개념!



~~~java
// 실행되는 시점이 선언되는 위치에 따라 아래와 같이 다름
System.out.println("before filter");
chain.doFilter(request,response);
System.out.println("after filter");

//따라서,
request.setCharacterEncoding("UTF-8");
chain.doFilter(request,response);
//이렇게 두면 모든 servlet은 encoding filter를 갖게 됨
~~~



## 입력 데이터 배열로 받기

~~~java
String[] num_ = request.getParameterValues("num");
int result = 0;
for(int i=0; i<num_.length; i++) {
    int num = Integer.parseInt(num_[i]);
    result += num;
}
~~~

이런 식으로 배열로 입력값을 처리하게 된다면 input(name은 서로 동일)의 개수에 상관없이 여러 데이터를 다룰 수 있게 됨.



## 상태 유지의 필요성

servlet들이 죽더라도 서로 공유할 수 있는 정보가 필요하다

=> application / session / cookie로 handle 가능



### Application 객체

Application 저장소 : 서블릿 Context

=> 일종의 책갈피. 상태 저장 공간. 서블릿의 자원을 공유할 수 있는 공간

=> 서블릿들이 사라져도 해당 자원에 대한 정보를 포함하고 있음



~~~ java
ServletContext application = request.getServletContext(); // application 저장소, ServletContext 선언, 전역으로 값 저장 가능
		
		
response.setCharacterEncoding("UTF-8");
response.setContentType("text/html; charset=UTF-8");

String v_ = request.getParameter("x");
String op = request.getParameter("operator");


int v = 0;

if(!v_.equals("")) v = Integer.parseInt(v_);

if(op.equals("=")) {
    // 값을 계산한다!

    int x = (Integer)application.getAttribute("value"); // 앞에서 자장한 값
    int y = v; // 사용자가 지금 입력한 값
    String operator = (String)application.getAttribute("op");
    int result = 0;	

    if(operator.equals("+")) {
        result = x + y;
    } else {
        result = x - y;
    }
    response.getWriter().printf("result : %d", result);

} else {
    // 값을 저장한다!
    application.setAttribute("value", v);
    application.setAttribute("op", op);

}
~~~

setAttribute로 전역 변수를 setting해주고, getAttribute로 값을 불러온다.

하지만 이렇게 하게 되면, 단순 계산(a+b = c)밖에 하지 못함.(3개 이상의 변수로 계산 불가능, setAttribute로 계산하려는 값이 계속 갱신되므로)



## Session 객체로 상태 값 저장하기



코드는 application 객체와 비슷함

~~~java
ServletContext application = request.getServletContext(); // application 저장소, ServletContext 선언, 전역으로 값 저장 가능
HttpSession session = request.getSession();	// session 객체 선언



response.setCharacterEncoding("UTF-8");
response.setContentType("text/html; charset=UTF-8");

String v_ = request.getParameter("x");
String op = request.getParameter("operator");


int v = 0;

if(!v_.equals("")) v = Integer.parseInt(v_);

if(op.equals("=")) {
    // 값을 계산한다!

    //			int x = (Integer)application.getAttribute("value"); // 앞에서 자장한 값
    int x = (Integer)session.getAttribute("value"); // 앞에서 자장한 값
    int y = v; // 사용자가 지금 입력한 값
    //			String operator = (String)application.getAttribute("op");
    String operator = (String)session.getAttribute("op");
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
    session.setAttribute("value", v);
    session.setAttribute("op", op);

}
~~~



#### 차이점

- Application 객체
  - 이 객체를 사용할 때, Application  전역에서 사용 가능하다!
- Session 객체
  - Session 범주 내에서 사용 가능하다!
    - Session이란, 현재 접속한 사용자를 의미함 => 사용자 별로 공간이 달라질 수 있음. 따라서, 사용자간 독립적인 값을 갖게 됨.
    - 동일 브라우저는 같은 session으로 인식함



## 웹 서버가 현재 사용자(Session)를 구분하는 방식



Session ID가 WAS에 의해 발급됨

=> 발급된 ID는 브라우저가 계속 가지고 있음. 같은 브라우저라면 같은 번호를 발급 받음, 브라우저 닫으면 해당 번호 삭제

 => 서버는 해당 Session ID를 담고 있는 캐비넷 같은 것을 임시로 가지고 있음. 일정 시간마다 사용자의 요청이 없을 시 서버는 캐비넷의 메모리를 수거해감.



Session ID 가 달라지면 서버는 다른 이용자로 식별함

다른 유저의 Session ID를 훔쳐서 요청 보내면, 서버는 같은 사용자로 인식하게 됨.





## Cookie를 이용해 상태 값 유지하기

상태 값을 클라이언트에 두고 있는 것 => 쿠키

서버 쪽의 저장소 : Application, Session

클라이언트 쪽의 저장소 : Cookie



클라이언트가 서버에 Request할 때

- Header 정보(브라우저가 알아서 담아줌) / getHeader
- 사용자 데이터(내가 보내는 데이터) / getParameter
- 쿠키 / getCookies

서버가 클라이언트에게 Response 할 때

- addCookie => 쿠키를 심어서 보낼 수 있음 => 클라이언트가 해당 쿠키를 저장함

~~~ java
// 쿠키 저장하기
Cookie cookie = new Cookie("c", String.valueOf(result)); // key - value 값으로 쿠키 보냄
response.addCookie(cookie);

// 쿠키 읽기
Cookie[] cookies = request.getCookies(); // 배열로 옴
String c_ = "";

if(cookies != null){
    for (Cookie cookie: cookies){
        if("c".equals(cookie.getName())){ // 쿠키를 찾고, 해당 값의 value를 얻는다!
            c_ = cookie.getValue(); 
        }
    }
}
~~~

쿠키는 무조건 문자열(url에 추가할 수 있는) 형태로만 보내야 함

~~~ java
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
    response.addCookie(valueCookie);
    response.addCookie(opCookie); // 쿠키 클라이언트에게 전달
}


~~~



쿠키 사용한 코드



## Cookie의 path 옵션

보편적으로 servlet 끼리의 쿠키는 달라야 함

따라서, 해당 url에 관련된 servlet에만 해당 쿠키를 사용할 수 있게끔 해줘야 함

=> path 옵션

~~~java
Cookie valueCookie = new Cookie("value", String.valueOf(v));
Cookie opCookie = new Cookie("op", op);

valueCookie.setPath("/cal2"); // 해당 url이 포함된 url에 대한 쿠키를 가져와라.(setPath)
opCookie.setPath("/cal2");

response.addCookie(valueCookie);
response.addCookie(opCookie); // 쿠키 클라이언트에게 전달

~~~

setPath를 통해 해당 path를 담고 있는 url에게만 cookie를 보낼 수 있게 설정할 수 있음



## Cookie의 maxAge 옵션

브라우저가 닫히면 Cookie는 날라감

하지만, 기간을 설정하면 브라우저가 날라가도 Cookie 값을 유지할 수 있음

브라우저가 닫히더라도 기간을 설정해두면 이는 외부 파일로 값을 가지고 있게 됨.

~~~ java
valueCookie.setMaxAge(60*60); // 만료 날짜를 설정할 수 있음. 초 단위. 브라우저를 닫아도 만료 날짜까지 쿠키는 사라지지 않는다!
~~~



## Application / Session / Cookie 차이점 정리

- Application
  - 사용 범위 : 전역 범위에서 사용하는 저장 공간
  - 생명 주기 : WAS가 시작해서 종료할 때 까지
  - 저장 위치 : WAS 서버의 메모리
- Session
  - 사용 범위 : 세션 범위(특정 사용자)에서 사용하는 저장 공간
  - 생명 주기 : 세션이 시작해서 종료할 때 까지
  - 저장 위치 : WAS 서버의 메모리
- Cookie
  - 사용 범위 : 웹 브라우저별 지정한 path 범주 공간
  - 생명 주기 : 브라우저에 전달한 시간부터 만료시간 까지
  - 저장 위치 : 웹 브라우저의 메모리 or file

따라서, 기간이 길게 어떤 값을 저장하고 싶다 or 특정 링크에만 적용하는 데이터를 쓰고 싶다? => 무조건 쿠키 사용할 것.



## Redirect

response.sendRedirect("경로");



## 쿠키 삭제하기

그냥 빈 문자열 전달하면 안됨.

.setMaxAge(0) 하면 바로 삭제됨.



## GET 요청과 POST 요청에 특화된 서비스 함수

~~~java
// 첫번째 방법
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	if(request.getMethod().equals("GET")){
        
    } else if(request.getMethod().equals("POST")){
        
    }
    super.service(request, response) // 이 놈이 GET 요청일 시 doGet, POSt 요청일 시 doPost 메서드 실행시켜줌
        // 아니면 위 로직 없이 바로 doGet, do Post 오버라이드해서 사용 가능
}

//
~~~



GET, POST를 따로 처리하게끔 하는 자바 클래스를 만들면 쿠키 관련 문제가 생길 수 있음

path 설정은 하나의 url만 설정 가능 => 따라서 GET, POST 는 합쳐줘야 함



