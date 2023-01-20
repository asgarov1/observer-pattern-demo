package com.asgarov.pattern;

public class Runner {
    public static void main(String[] args) {
        SocialEngineeringSubject subject = new SocialEngineeringSubject();

        subject.register(new HackerObserver("Steve"));
        HackerObserver michael = new HackerObserver("Michael");
        subject.register(michael);
        subject.doSocialEngineering();

        System.out.println();
        subject.deregister(michael);
        subject.doSocialEngineering();
    }
}
