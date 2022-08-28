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



