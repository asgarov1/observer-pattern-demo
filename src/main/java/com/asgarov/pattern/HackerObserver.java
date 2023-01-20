package com.asgarov.pattern;

public class HackerObserver implements Observer {

    private final String name;

    public HackerObserver(String name) {
        this.name = name;
    }

    @Override
    public void notify(Object event) {
        //send an email or whatever
        System.out.println(name + " received an event: " + event);
    }

    @Override
    public String toString() {
        return "HackerObserver{" +
                "name='" + name + '\'' +
                '}';
    }
}
