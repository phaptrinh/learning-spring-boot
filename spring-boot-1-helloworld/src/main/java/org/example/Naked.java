package org.example;

import org.springframework.stereotype.Component;

@Component("naked")
public class Naked implements Outfit {
    @Override
    public void wear() {
        System.out.println("Wearing nothing");
    }
}