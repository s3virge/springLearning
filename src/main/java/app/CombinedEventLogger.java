package app;

import java.util.Collection;

public class CombinedEventLogger implements EventLogger {

    private Collection<EventLogger> loggers;

    @Override
    public void logEvent(Event event) {
        for (EventLogger el: loggers ) {
            el.logEvent(event);
        }
    }

    public CombinedEventLogger(Collection<EventLogger> loggers) {
        this.loggers = loggers;
    }
}
