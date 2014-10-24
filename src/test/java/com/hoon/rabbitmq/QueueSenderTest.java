package com.hoon.rabbitmq;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class QueueSenderTest {
    final static String host = "0.0.0.0";
    final static String vhost = "";
    final static int port = 5672;
    final static String user = "hoon";
    final static String password = "2323";
    final static String queue = "simplequeue";

    @Test
    public void MessageSenderTest() throws Exception{
        MessageSender sender = new MessageSender();
        String uri = "amqp://"+user+":"+password+"@"+host+":"+port;//+"/"+vhost;
        String msg = "hello world" + System.currentTimeMillis();

        for(int i=0;i<1000;i++)
            assertTrue(sender.sendMessage(uri, queue, msg));
    }



}
