package com.epam.spring.logger;


import com.epam.spring.beans.Event;

public interface EventLogger {

    /**
     * Uses for log our message to somewhere
     * @param event - event which needed to log
     */
    public void logEvent (Event event);
}
