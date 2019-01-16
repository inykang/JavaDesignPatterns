package com.journaldev.structural.composite;

import com.journaldev.structural.decorator.Car;
import com.journaldev.structural.decorator.CarDecorator;

public class LuxuryCar extends CarDecorator {

    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding features of Luxury Car.");
    }
}
