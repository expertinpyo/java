# EndTalk Project



[0] 개론

메이븐(Maven) vs 그래들(Gradle)

 둘 다 빌드관리 도구이나, 차이점 존재

- Apache Maven
  - 자바용 프로젝트 관리 도구
  - Apache Ant 대용
  - 프로젝트를 진행하면서 사용하는 수 많은 라이브러리들을 관리해줌
    - 그 라이브러리들과 연관된 라이브러리들까지 거미줄처럼 모두 연동되서 관리
    - 네트워크를 통해 연관된 라이브러리까지 같이 업데이트를 해주기 때문에 사용 편리
- Gradle
  - 빌드, 프로젝트 구성/관리, 테스트, 배포 도구
  - 안드로이드 앱의 공식 빌드 시스템
  - 빌드 속도가 Maven에 비해 10~100배 빠름
  - JAVA, C/C++, Python 지원
  - Groovy 스크립트 기반으로 만들어져 기존의 Ant 역할 + 배포 스크립트 기능까지 수행 가능
    - Groovy : Java 가상 머신에서 실행되는 스크립트 언어



Gradle은 별도의 빌드 스크립트를 통해 사용할 앱 버전, 라이브러리 등의 항목 설정 가능

성능 등의 이유로 Gradle 선호



디렉토리

src/main/java :  자바 파일 작성 공간. controller, form, dto, entity, service file 등

src/main/resources : 자바 파일 제외 HTML, CSS, Java Script, 환경파일 존재

template : 템플릿 파일 저장





Repository 

= > 엔티티에 의해 생성된 데이터베이스 테이블에 접근하는 메서드들을 사용하기 위한 인터페이스

데이터 처리를 위한 CRUD를 어떻게 처리할지 정의하는 역할



타임리프 th: 로 시작하는 속성 => 타임리프 템플릿 엔진이 사용하는 속성임.

이 부분이 자바와 연결되는 부분

