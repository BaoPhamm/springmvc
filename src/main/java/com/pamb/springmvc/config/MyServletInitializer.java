package com.pamb.springmvc.config;

//import org.springframework.web.WebApplicationInitializer;
//import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.web.servlet.DispatcherServlet;
//
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRegistration;
//
//public class MyServletInitializer implements WebApplicationInitializer {
//
//    @Override
//    public void onStartup(ServletContext servletContext) throws ServletException {
//        final AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
//        context.setServletContext(servletContext);
//        context.register(WebConfig.class);
//        final DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
//        ServletRegistration.Dynamic servlet =
//                servletContext.addServlet("springDispatcherServlet", dispatcherServlet);
//        servlet.setLoadOnStartup(1);
//        servlet.addMapping("/servlet2/*");
//    }
//}
