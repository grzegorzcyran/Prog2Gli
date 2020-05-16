package com.grcy.patterns.behavioral.visitor;

public interface ItemElement {

    int accept(ItemVisitor visitor);

}
