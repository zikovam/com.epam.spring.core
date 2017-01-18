package com.epam.spring.logger;

import com.epam.spring.Event;

/**
 * Created by zikovam on 18.01.17.
 */
public class ConsoleEventLogger implements EventLogger{

    public void logEvent (Event event) {
        System.out.println(event);
    }
}
