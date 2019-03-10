package lesson7;

import java.util.Collection;

public class CombinedEvenLogger implements EventLogger {

    private Collection loggers;

    @Override
    public void logEvent(Event event) {
        for (; ; ) {

        }
    }

    public CombinedEvenLogger(Collection loggers) {
        this.loggers = loggers;
    }
}
