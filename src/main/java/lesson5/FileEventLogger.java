package lesson5;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class FileEventLogger implements EventLogger {
    private String fileName;
    private File logFile;

    public FileEventLogger(String fileName) {
        this.fileName = fileName;
        logFile = new File(fileName);
    }

    //appends to file
    public void logEvent(Event event) {

        try {
            FileUtils.writeStringToFile(logFile, event.toString(), "UTF-8", true);
        }
        catch (IOException ioEx) {
            System.out.println(ioEx.getMessage());
            throw new RuntimeException();
        }
    }

    public void init() throws IOException{
        this.logFile = new File(fileName);

        // create new file if he is absent
        FileUtils.touch(logFile);

        if (!logFile.canWrite()) {
            System.out.println(">>     Error! File cannot be written.    <<");
            throw new IOException();
        }

        System.out.println("FileEventLogger.init() was invoked");
    }
}
