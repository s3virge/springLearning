package lesson4;

public class App {
    private Client client;
    private ConsoleEventLogger eventLogger;

    private void logEvent(String msg) {
        String message = msg.replaceAll(client.getId(), client.getName());
        eventLogger.logEvent(message);
    }

    public static void main(String[] args) {
        App app = new App();

        app.client = new Client("1", "John Smith");
        app.eventLogger = new ConsoleEventLogger();
        app.logEvent("Some event for client 1");
    }
}
