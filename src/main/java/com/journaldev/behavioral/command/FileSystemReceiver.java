package com.journaldev.behavioral.command;

public interface FileSystemReceiver {
    void openFile();

    void writeFile();

    void closeFile();
}
