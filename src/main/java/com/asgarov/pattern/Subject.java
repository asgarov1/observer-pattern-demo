package com.asgarov.pattern;

public interface Subject {

    void reportEvent(Object event);

    void register(Observer observer);
    void deregister(Observer observer);
}
