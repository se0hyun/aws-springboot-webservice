package com.springbootaws.book.awsspringbootwebservice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)     // JUnit에 내장된 실행자 외에 다른 실행자 실행
@WebMvcTest
public class HelloControllerTest {
    @Autowired  // 스프링이 관리하는 Bean 주입받음
    private MockMvc mvc;    // 웹 API를 테스트할 때 사용
                            //MVC 테스트의 시작점 -> HTTP GET, POST 등 테스트 가능

    @Test
    public void hello_return() throws Exception{
        String hello = "hello";

        mvc.perform(get("/hello"))  // MockMVC 통해 해당 주소로 GET 요청
                    .andExpect(status().isOk())     // mvc.perform 의 결과 검증, HTTP Header의 Status 검증  -> 여기선 200 검증
                    .andExpect(content().string(hello));    // mvc.perform의 결과 검증, 응답 본문의 내용 검증 -> Controller에서 hello를 리턴하기 때문에 이 값이 맞는지 검증
    }
}
