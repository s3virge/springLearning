package lesson4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.Console;

public class App {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springconflesson4.xml");

        Client client = ctx.getBean("client", Client.class);
        EventLogger eventLogger = ctx.getBean("eventLogger", EventLogger.class);

        //spring generates a new event object every time
        for (int c = 0; c < 10; c++) {
            Event event = ctx.getBean("event", Event.class);
            eventLogger.logEvent(event);
            System.out.println("----------------------------------");
        }
    }
}
