package com.hoon.rabbitmq;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;


public class QueueReceiverTest {
    final static String host = "0.0.0.0";
    final static String vhost = "";
    final static int port = 5672;
    final static String user = "hoon";
    final static String password = "2323";
    final static String queue = "simplequeue";

    @Test
    public void MessageReceiverTest() throws Exception{
        MessageReceiver receiver = new MessageReceiver();
        String uri = "amqp://"+user+":"+password+"@"+host+":"+port;//+"/"+vhost;
        String msg = receiver.receive(uri, queue);
        assertNotNull(msg);
    }



}