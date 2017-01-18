package com.epam.spring;

import com.epam.spring.logger.ConsoleEventLogger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public Client client;
    public ConsoleEventLogger eventLogger;

    public App (Client client, ConsoleEventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public void logEvent (String msg){
        String message = msg.replaceAll(
                client.getId(), client.getFullName());

        eventLogger.logEvent(message);
    }

    public static void main (String[] args) {

        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("spring.xml");

        App app = (App) ctx.getBean("app");

        app.logEvent("Great event for 1");
        app.logEvent("Great event for 2");
    }
}
