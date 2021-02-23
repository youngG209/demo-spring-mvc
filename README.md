# demo-spring-mvc

### 스프링 부트의 스프링 MVC

1. 설정
    1) Spring Boot에 적용된 자동 설정이 동작
        2) JSP 보다 Thymeleaf 선호
        3) Json 지원
        4) 정적 리소스 (+ 웰컴 페이지, 파비콘(웹사이트 아이콘) 등 지원)
        5) 스프링 부트를 사용하게 되면, 다른 설정이 지정되어 있지 않아도 자동 설정을 활용하여 어플리케이션을 개발할 수 있다.
    
    2) 스프링 MVC 설정 커스터마이징 (스프링 부트)
        1) application.properties
        2) @Configuration + Implements WebMvcConfigurer
           - 스프링 부트의 스프링 MVC 자동 설정 사용 (+ 추가 설정 가능)
        3) @Configuration + @EnableWebMvc (+ Implements WebMvcConfigurer)
           - 직접 설정 구현 (자동 설정 사용 X)