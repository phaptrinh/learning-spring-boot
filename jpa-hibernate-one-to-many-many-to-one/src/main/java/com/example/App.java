package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class, args);
        Address address1 = new Address();
        address1.setCity("Hanoi");

        Person person1 = new Person();
        person1.setName("An");
        person1.setAddress(address1);

        Person person2 = new Person();
        person2.setName("Binh");
        person2.setAddress(address1);

        AddressRepository addressRepository = context.getBean(AddressRepository.class);
        addressRepository.save(address1);

        PersonRepository personRepository = context.getBean(PersonRepository.class);
        personRepository.save(person1);
        personRepository.save(person2);

    }
}
