package lesson4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    private Client client;
    private ConsoleEventLogger eventLogger;

    public App(Client client, ConsoleEventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    private void logEvent(String msg) {
        String message = msg.replaceAll(client.getId(), client.getName());
        eventLogger.logEvent(message);
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springconflesson4.xml");
        App appBean = (App) ctx.getBean("app");

        appBean.logEvent("msg");
    }
}
