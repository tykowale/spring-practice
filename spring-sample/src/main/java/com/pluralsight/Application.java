package com.pluralsight;

import com.pluralsight.model.Customer;
import com.pluralsight.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by tylerkowalewski on 10/25/15.
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        CustomerService service = appContext.getBean("customerService", CustomerService.class);

        System.out.println(service.findAll().get(0).getFirstName());
    }
}
