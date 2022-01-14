package com.example;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue
    private Long id;

    String name;

    @ManyToOne
    @JoinColumn(name = "address_id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Address address;
}
