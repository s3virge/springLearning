package lesson4;

import java.text.DateFormat;
import java.util.Date;

public class Event {
    private int id = (int) (Math.random() * 100);
    private String msg = "objects in mirror are closer than they appear: " + (int) (Math.random() * 10000);
    private Date date;
    private DateFormat df;

    public Event(Date date, DateFormat dateFormat) {
        this.date = date; this.df = dateFormat;
    }

    public String toString() {
        return "id: " + id +
                "\nmsg: " + msg +
                " \ndata: " + df.format(date);
    }
}
