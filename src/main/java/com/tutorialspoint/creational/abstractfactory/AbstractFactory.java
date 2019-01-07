package com.tutorialspoint.creational.abstractfactory;

import com.tutorialspoint.creational.factory.Shape;

public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape) ;
}
