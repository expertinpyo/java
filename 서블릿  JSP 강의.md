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



