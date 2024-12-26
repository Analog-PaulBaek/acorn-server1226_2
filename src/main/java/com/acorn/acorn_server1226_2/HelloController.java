package com.acorn.acorn_server1226_2;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {


    @GetMapping("/data")
    public String hi(){
        return "hi DATA ^^ 코드수정";
    }
}
