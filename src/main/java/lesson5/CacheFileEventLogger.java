package lesson5;

import java.util.ArrayList;
import java.util.List;

public class CacheFileEventLogger extends FileEventLogger {
    private int cacheSize;
    private List<Event> cache = new ArrayList<>();

    public CacheFileEventLogger(String fileName, int cacheSize) {
        super(fileName);
        this.cacheSize = cacheSize;
    }

    public void logEvent(Event event) {
        cache.add(event);

        if (cache.size() == cacheSize) {
            writeEventsFromCacheToFile();
            cache.clear();
        }
    }

    private void writeEventsFromCacheToFile() {
        for (int c = 0; c < cache.size(); c++) {
            super.logEvent(cache.get(c));
        }
    }
}
