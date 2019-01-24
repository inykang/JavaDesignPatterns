package com.journaldev.behavioral.visitor;

public interface ItemElement {
    int accept(ShoppingCartVisitor visitor);
}
