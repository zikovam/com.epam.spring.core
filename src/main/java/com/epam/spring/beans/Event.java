package com.epam.spring.beans;

import javafx.scene.input.DataFormat;

import java.text.DateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by zikovam on 18.01.17.
 */
public class Event {

    private int id = new Random().nextInt(100);

    private String msg;

    private Date date;
    private DateFormat df;

    public String getMsg () {
        return msg;
    }
    public void setMsg (String msg) {
        this.msg = msg;
    }
    public Event (Date date, DateFormat df) {
        this.date = date;
        this.df = df;
    }

    @Override
    public String toString () {
        return "Event:" +
                " id=" + id +
                ", msg='" + msg + '\'' +
                ", date=" + df.format(date);
    }
}
