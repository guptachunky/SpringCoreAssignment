package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationMain {
    public static void main(String[] args) {
//        Question 1 and 2
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
//        Database database = applicationContext.getBean(Database.class);
//        System.out.println(database.getPort());
//        System.out.println(database.getName());


        //Question 3 and 4
//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-config.xml");
////      Restaurant restaurant=applicationContext.getBean("teaRestaurant",Restaurant.class);
//        Restaurant restaurant=applicationContext.getBean("expressRestaurant",Restaurant.class);
//        restaurant.getHotDrink().prepareHotDrink();


        //Question 5 and 6
//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-config.xml");
//        Complex complex=applicationContext.getBean(Complex.class);
//        System.out.println("List ================"+complex.getList());
//        System.out.println("Set ================"+complex.getSet());
//        System.out.println("Map ================"+complex.getMap());


        // Auto Wiring
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
////        Restaurant restaurant = applicationContext.getBean("byName", Restaurant.class);
////        Restaurant restaurant = applicationContext.getBean("byType", Restaurant.class);
//        Restaurant restaurant = applicationContext.getBean("constructor", Restaurant.class);
//        restaurant.getHotDrink().prepareHotDrink();


        //Ques Isprototype

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Restaurant restaurant = applicationContext.getBean("prototype", Restaurant.class);
        System.out.println(applicationContext.isPrototype("prototype"));
    }

}
