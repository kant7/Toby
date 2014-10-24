package com.jms.main;

import com.jms.BackOffice;
import com.jms.Mail;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: Coupang
 * Date: 14. 7. 26
 * Time: 오후 3:18
 * To change this template use File | Settings | File Templates.
 */
public class BackOfficeMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beansback.xml");

        BackOffice backOffice = (BackOffice)context.getBean("backOffice");
        Mail mail = backOffice.receiveMail();
        System.out.println("Mail #" + mail.getMailId() + " received");
    }
}
