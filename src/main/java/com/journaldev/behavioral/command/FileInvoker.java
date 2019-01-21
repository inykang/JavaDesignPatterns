package com.journaldev.behavioral.command;

public class FileInvoker {
    public Command commnad;

    public FileInvoker(Command c) {
        this.commnad = c;
    }

    public void execute() {
        this.commnad.execute();
    }
}
