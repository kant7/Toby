package com.recipes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: Coupang
 * Date: 14. 7. 26
 * Time: 오전 1:00
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        SequenceGenerator generator = (SequenceGenerator)context.getBean("sequenceGenerator");
        System.out.println(generator.getSequence());
        System.out.println(generator.getSequence());
    }
}
