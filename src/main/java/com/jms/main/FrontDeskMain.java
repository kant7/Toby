package com.jms.main;

import com.jms.FrontDesk;
import com.jms.Mail;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: Coupang
 * Date: 14. 7. 26
 * Time: 오후 3:11
 * To change this template use File | Settings | File Templates.
 */
public class FrontDeskMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beansfront.xml");

        FrontDesk frontDesk = (FrontDesk)context.getBean("frontDesk");
        frontDesk.sendMail(new Mail("1234", "US", 1.5));
    }
}
