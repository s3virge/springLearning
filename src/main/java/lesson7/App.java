package lesson7;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class App {

    private Client client;
    private EventLogger eventLogger;
    private Map<EventType, EventLogger> loggers;
    private EventLogger defaultLogger;

    public App(Client client, EventLogger eventLogger, Map<EventType, EventLogger> loggers) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    private void logEvent(EventType type, String msg) {
        String message = msg.replaceAll(client.getId(), client.getName());
        event.setMsg(message);

        EventLogger logger = loggers.get(eventType);
        if (logger == null) {
            logger = defaultLogger;
        }

        logger.logEvent(event);
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("lesson7/spring.xml");

        Client client = ctx.getBean("client", Client.class);
        EventLogger eventLogger = ctx.getBean("eventLogger", EventLogger.class);

        //spring generates a new event object every time
        for (int c = 0; c < 10; c++) {
            Event event = ctx.getBean("event", Event.class);
            eventLogger.logEvent(event);
        }

        ctx.close();
    }

    public EventLogger getDefaultLogger() {
        return defaultLogger;
    }
}
