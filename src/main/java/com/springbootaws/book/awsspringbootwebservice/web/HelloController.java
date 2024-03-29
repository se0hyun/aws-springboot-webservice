package com.springbootaws.book.awsspringbootwebservice.web;

import com.springbootaws.book.awsspringbootwebservice.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController     // 컨트롤러를 JSON을 반환하는 컨트롤러로 만들어줌
public class HelloController {
    @GetMapping("/hello")       // GET의 요청을 받을 수 있는 API를 만들어 줌.
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name,     // RequestParam : 외부에서 API로 넘긴 파라미터를 가져오는 애노테이션
                                     @RequestParam("amount") int amount){   // 외부에서 name (@RequestParam("name")) 이란 이름으로 넘긴 파라미터를 메소드 파라미터 name(String name)에 저장

        return new HelloResponseDto(name, amount);
    }
}
