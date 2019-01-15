package com.journaldev.creational.builder;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComputerBuilderTest {

    @Test
    public void buildComputer() {
        Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build()
                ;

        System.out.println(comp);
    }

}