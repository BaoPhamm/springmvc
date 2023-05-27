package com.pamb.springmvc.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet(
//        name = "MyFirstCustomServlet",
//        description = "Example Servlet Using Annotations",
//        loadOnStartup = 1,
//        urlPatterns = {"/servlet1/*"}
//)
//public class MyFirstCustomServlet extends HttpServlet {
//
//    @Override
//    protected void doGet(
//            HttpServletRequest request,
//            HttpServletResponse response) throws ServletException, IOException {
//        System.out.println("IN TO MyFirstCustomServlet");
//
////        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/home.jsp");
////        dispatcher.forward(request, response);
//
//        request.getRequestDispatcher("/main-servlet/*").forward(request, response);
//
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        // Implement your custom request processing logic for POST requests here
//
//        // For example, you can forward the request to a specific controller method
//        // based on the request URL or perform any other custom logic.
//
//        // Here, we simply delegate the request to the Spring MVC framework
//        request.getRequestDispatcher("/main-servlet/*").forward(request, response);
//    }
//
//}
