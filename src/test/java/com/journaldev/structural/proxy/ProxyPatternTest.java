package com.journaldev.structural.proxy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProxyPatternTest {

    @Test
    public void runCommand() {
        CommandExecutor executor
                = new CommandExecutorProxy("Pankaj", "wrong_pwd");

        try {
            executor.runCommand("ls -ltr");
            executor.runCommand(" rm -rf abc.pdf");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}