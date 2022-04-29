package com.automationpractice.pages.handlers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

public class FileHandler {
    private static Logger log = LoggerFactory.getLogger(FileHandler.class);
    private String filePath;

    public FileHandler(String filePath) {
        this.filePath = filePath;
    }

    public File getFile() {
        return new File(filePath);
    }

    private File createFile() {
        File file = getFile();
        try {
            if (file.createNewFile()) {
                log.info("File created: " + file.getName());
            } else {
                log.info("File already exists: " + file.getName());
            }
        } catch (IOException e) {
            e.printStackTrace();
            log.warn("Can't create file!");
        }
        return file;
    }
}
