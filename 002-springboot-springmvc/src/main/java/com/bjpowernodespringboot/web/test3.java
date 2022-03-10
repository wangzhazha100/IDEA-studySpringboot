package com.bjpowernodespringboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller //@Controller（视图解析器可以解析return 的jsp,html页面）
/*@RequestMapping("/say")*/
public class test3 {

    @RequestMapping("/say1")
    public ModelAndView say1(){
        ModelAndView view =new ModelAndView();
        view.setViewName("say");
        return view;
    }

    @RequestMapping("/say2")
    public String say2(){
        return "say";
    }
}
