package com.journaldev.behavioral.chain;

import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class ATMDispenseChainDemo {
    private DispenseChain c1;

    @Before
    public void setup() {
        // initialize the chain
        this.c1 = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();

        // set the chain of responsibility
        c1.setNextChain(c2);
        c2.setNextChain(c3);
    }

    @Test
    public void dispense() {
        int amount = 230;

        if(amount % 10 != 0) {
            System.out.println("Amount should be in multiple of 10s.");
            return;
        }
            // process the request
            c1.dispense(new Currency(amount));
    }
}