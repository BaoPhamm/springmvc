package com.pamb.springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.pamb.springmvc.web"})
public class WebConfig implements WebMvcConfigurer {

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver =
                new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

//    @Bean
//    public ServletRegistrationBean<HttpServlet> firstServlet() {
//        ServletRegistrationBean<HttpServlet> servRegBean = new ServletRegistrationBean<>();
//        servRegBean.setServlet(new MyFirstCustomServlet());
//        servRegBean.addUrlMappings("/servlet1/*");
//        servRegBean.setLoadOnStartup(1);
//        return servRegBean;
//    }

//    @Bean
//    public ServletRegistrationBean<HttpServlet> secondServlet() {
//        ServletRegistrationBean<HttpServlet> servRegBean = new ServletRegistrationBean<>();
//        servRegBean.setServlet(new MySecondCustomServlet());
//        servRegBean.addUrlMappings("/servlet2");
//        servRegBean.setLoadOnStartup(1);
//        return servRegBean;
//    }

    @Override
    public void configureDefaultServletHandling(
            DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/resources/**")
//                .addResourceLocations("/resources/").setCachePeriod(3600)
//                .resourceChain(true).addResolver(new PathResourceResolver());
//    }

}
