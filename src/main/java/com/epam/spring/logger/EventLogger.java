package com.epam.spring.logger;


public interface EventLogger {

    /**
     * Uses for log our message to somewhere
     * @param msg - message to log
     */
    public void logEvent (String msg);
}
