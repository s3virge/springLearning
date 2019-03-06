package lesson3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    private Client client;
    private ConsoleEventLogger eventLogger;

    public App(Client client, ConsoleEventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");

        ConsoleEventLogger eventLoggerBean = (ConsoleEventLogger) ctx.getBean("eventLogger");

        eventLoggerBean.logEvent("Message number one");
        eventLoggerBean.logEvent("Message number two");
        eventLoggerBean.logEvent("Message number three");
    }
}
