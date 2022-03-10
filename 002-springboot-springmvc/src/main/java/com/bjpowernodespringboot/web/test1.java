package com.bjpowernodespringboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//相当于@Controller（视图解析器可以解析return 的jsp,html页面） + @ResponseBody （返回json等内容到页面）
public class test1 {

    @RequestMapping("/say")
    public String say(){
        return "Hello,SpringBoot~";
    }
}
