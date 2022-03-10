package com.bjpowernodespringboot.web;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //@Controller（视图解析器可以解析return 的jsp,html页面）
@RequestMapping("/say1")
public class test2 {

    @RequestMapping("/say2")
    @ResponseBody
    public String say(){
        return "say1/say2,Hello ~";
    }
}
