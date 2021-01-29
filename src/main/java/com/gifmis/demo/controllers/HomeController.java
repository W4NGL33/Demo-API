package com.gifmis.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping()
    public String Home(){
     return ("HomePage");
    }

    @GetMapping("about-us")
    public String AboutUs(){
        return ("About");
    }

    @GetMapping("contact-us")
    public String ContactUs(){
        return ("ContactUs");
    }

    @GetMapping("footer")
    public String Footer(){
        return ("footer");
    }
}
