package com.pamb.springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/main-servlet")
public class HomeController {
    @GetMapping("/home")
    public String home() {
        System.out.println("Controller home");
        return "home";
    }
}
