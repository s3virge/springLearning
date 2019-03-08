package lesson5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springconflesson5.xml");

        Client client = ctx.getBean("client", Client.class);
        EventLogger eventLogger = ctx.getBean("eventLogger", EventLogger.class);

        //spring generates a new event object every time
        for (int c = 0; c < 10; c++) {
            Event event = ctx.getBean("event", Event.class);
            eventLogger.logEvent(event);
        }
    }
}
