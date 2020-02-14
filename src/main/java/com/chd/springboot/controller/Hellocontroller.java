package com.chd.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther:xue
 * @Date:2020/2/7 21:04
 */
/*
@ResponseBody//这个类的所有数据直接写给浏览器（如果是对象，还能专程jaso是数据）
@Controller
*/
@RestController//能完成上面两个功能
public class Hellocontroller {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

}
