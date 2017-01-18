package com.epam.spring.logger;

/**
 * Created by zikovam on 18.01.17.
 */
public class ConsoleEventLogger implements EventLogger{

    public void logEvent (String msg){
        System.out.println(msg);
    }
}
