package com.epam.spring.logger;

import com.epam.spring.Event;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by zikovam on 18.01.17.
 */
public class FileEventLogger implements EventLogger{

    private String filename;

    public FileEventLogger (String filename) {
        this.filename = filename;
    }

    public void logEvent (Event event) {

        File file = new File(filename);

        try {
            FileUtils.writeStringToFile(
                    file
                    ,event.getMsg());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
