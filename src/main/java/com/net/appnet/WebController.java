package com.net.appnet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {



    @RequestMapping("/test")
    public String test()
    {
        System.out.println("jestem tutaj");
        return "index";
    }
    @RequestMapping("/hello")
    public String hello()
    {
        System.out.println("AppControler->hello()");
        return "hello";
    }

}
