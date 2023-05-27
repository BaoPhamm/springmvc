package com.pamb.springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/servlet2")
public class HomeController {
    @GetMapping("/home")
    public String home(HttpServletRequest request) {
        System.out.println("Controller home");
        String servletName = request.getServletPath();
        System.out.println("Current servlet: " + servletName);
        return "home";
    }
}
