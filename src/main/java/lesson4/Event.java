package lesson4;

import java.util.Date;

public class Event {
    private int id;
    private String msg;
    private Date date;

    public Event(Date date) {
        this.date = date;
    }

    public String toString() {
        return String.format("%d %s %t", id, msg, date);
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
