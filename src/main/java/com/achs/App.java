package com.achs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Vehicle obj = (Vehicle)context.getBean("vehicle");
        obj.status();
//    	Car car = new Car();
//    	car.status();
//    	Vehicle obj = new Bike();
//    	obj.status();

    }
}
