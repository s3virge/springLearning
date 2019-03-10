package lesson7;

public class ConsoleEventLogger implements EventLogger {
    public void logEvent(String msg) {
        System.out.println(msg);
    }

    public void logEvent(Event event) {
        System.out.println(event.toString());
    }

    public void logEvent(String msg, Client client) {
            String message = msg.replaceAll(client.getId(), client.getName());
        System.out.println(message);
    }
}
