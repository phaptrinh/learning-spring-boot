package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;

@SpringBootApplication
public class App implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Autowired
    PersonRepository personRepository;

    @Autowired
    AddressRepository addressRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        Address a1 = Address.builder().city("Hanoi").build();
        Address a2 = Address.builder().city("HCM").build();
        Address a3 = Address.builder().city("DN").build();

        Person p1 = Person.builder().name("An").build();
        Person p2 = Person.builder().name("Binh").build();

        a1.setPersons(List.of(p1, p2));
        a2.setPersons(List.of(p1));
        a3.setPersons(List.of(p2));

        addressRepository.saveAndFlush(a1);
        addressRepository.saveAndFlush(a2);
        addressRepository.saveAndFlush(a3);

    }
}
