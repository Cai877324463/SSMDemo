package org.lanqiao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 卢勇全 on 2017/9/1.
 */
@Controller  //告诉spring，这个类是一个controller
@RequestMapping("/test")  //请求的地址
public class HelloController {
    @RequestMapping("/hello.do")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/test.do")
    public String test(){
        //进行了一些业务处理
//        return "redirect:/hello.jsp";
        return "redirect:/hellohello.jsp";
    }
    @RequestMapping("/forTest.do")
    public String forwardTest(){
        System.out.println("进行了业务处理");
        return "forward:/hello.jsp";
    }
    @RequestMapping("/forwardTest.do")
    public ModelAndView forward(){
        Map map = new HashMap();
        map.put("name","cai");
        System.out.println("进行了业务处理");
        return new ModelAndView("forward:/hello.jsp",map);
    }

}
