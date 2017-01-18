package com.epam.spring;

import com.epam.spring.logger.ConsoleEventLogger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    private Client client;
    private ConsoleEventLogger eventLogger;

    public App (Client client, ConsoleEventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    private void logEvent (Event event, String msg){

        event.setMsg(msg);

        eventLogger.logEvent(event);
    }

    public static void main (String[] args) {

        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("spring.xml");

        App app = (App) ctx.getBean("app");

        app.logEvent((Event) ctx.getBean("event"), "Message 1");
        app.logEvent((Event) ctx.getBean("event"), "Message 2");
    }
}
