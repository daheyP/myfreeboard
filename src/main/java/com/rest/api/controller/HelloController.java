package com.rest.api.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//Spring에 해당 Class가 Controller임을 알려주기 위해 class명 상단에 @Controller를 붙여줍니다.
@Controller
public class HelloController {
    /*
    1. 화면에 helloworld가 출력됩니다.
    */
    @GetMapping(value = "/helloworld/string")
    @ResponseBody
    public String helloworldString() {
        return "helloworld";
    }
    /*
    2. 화면에 {message:"helloworld"} 라고 출력됩니다.
    */
    @GetMapping(value = "/helloworld/json")
    @ResponseBody
    //결과를 응답에 그대로 출력한다는 의미입니다.
    //@ResonseBody를 지정하지 않으면 return에 지정된 “helloworld” 이름으로 된 파일을 프로젝트 경로에서 찾아 화면에 출력합니다.
    public Hello helloworldJson() {
        Hello hello = new Hello();
        hello.message = "helloworld";
        return hello;
    }
    /*
    3. 화면에 helloworld.ftl의 내용이 출력됩니다.
    */
    @GetMapping(value = "/helloworld/page")
    public String helloworld() {
        return "helloworld";
    }

    @Setter
    @Getter
    public static class Hello {
        private String message;
    }
}