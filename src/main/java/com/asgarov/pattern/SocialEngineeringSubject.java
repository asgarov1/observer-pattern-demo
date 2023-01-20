package com.asgarov.pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SocialEngineeringSubject implements Subject {

    private final List<Observer> observerList = new ArrayList<>();

    @Override
    public void reportEvent(Object event) {
        observerList.forEach(observer -> observer.notify(event));
    }

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
        System.out.println("Registered " + observer);
    }

    @Override
    public void deregister(Observer observer) {
        observerList.remove(observer);
        System.out.println("Deregistered " + observer);
    }

    public void doSocialEngineering() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your password, this is Microsoft, I swear: ");
            String userInput = scanner.nextLine();
            if (!userInput.isBlank()) {
                reportEvent("I got the idiots password!!! Password: " + userInput);
                break;
            }
        }
    }

}
