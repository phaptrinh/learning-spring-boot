package com.example;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class App implements CommandLineRunner {
    private final PersonRepository personRepository;
    private final AddressRepository addressRepository;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Person person = Person.builder().name("loda").build();
        personRepository.save(person);

        Address address = Address.builder().city("Hanoi").person(person).build();
        addressRepository.save(address);
    }
}
