package com.journaldev.structural.composite;

import com.journaldev.structural.decorator.BasicCar;
import com.journaldev.structural.decorator.Car;
import com.journaldev.structural.decorator.SportsCar;
import org.junit.Test;

public class DecoratorTest {
    @Test
    public void decorate() {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n******");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }

}