package com.jms;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.support.JmsGatewaySupport;
import org.springframework.jms.support.JmsUtils;

import javax.jms.*;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Coupang
 * Date: 14. 7. 26
 * Time: 오후 2:51
 * To change this template use File | Settings | File Templates.
 */
public class BackOfficeImpl extends JmsGatewaySupport implements BackOffice {
    //private JmsTemplate jmsTemplate;
    //private Destination destination;

    /*public void setJmsTemplate(JmsTemplate jsmTemplate) {
        this.jmsTemplate = jsmTemplate;
    }*/

    /*public void setDestination(Destination destination) {
        this.destination = destination;
    }*/

    @Override
    public Mail receiveMail() {
        /*Map map = (Map)getJmsTemplate().receiveAndConvert();
        Mail mail = new Mail();
        mail.setMailId((String)map.get("mailId"));
        mail.setCountry((String)map.get("country"));
        mail.setWeight((Double)map.get("weight"));
        return mail;*/
        return (Mail)getJmsTemplate().receiveAndConvert();
        /*MapMessage message = (MapMessage)getJmsTemplate().receive();
        try {
            if (message == null) {
                return null;
            }
            Mail mail = new Mail();
            mail.setMailId(message.getString("mailId"));
            mail.setCountry(message.getString("country"));
            mail.setWeight(message.getDouble("weight"));
            return mail;
        } catch (JMSException e) {
            throw JmsUtils.convertJmsAccessException(e);
        }
*/
        /*ConnectionFactory cf = new ActiveMQConnectionFactory("tcp://localhost:61616");
        Destination destination = new ActiveMQQueue("mail.queue");

        Connection conn = null;
        try {
            conn = cf.createConnection();
            Session session = conn.createSession(false, Session.AUTO_ACKNOWLEDGE);
            MessageConsumer consumer = session.createConsumer(destination);

            conn.start();
            MapMessage message = (MapMessage)consumer.receive();
            Mail mail = new Mail();
            mail.setMailId(message.getString("mailId"));
            mail.setCountry(message.getString("country"));
            mail.setWeight(message.getDouble("weight"));
            session.close();
            return mail;
        } catch (JMSException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (JMSException e) {

                }
            }
        }
*/
    }
}
