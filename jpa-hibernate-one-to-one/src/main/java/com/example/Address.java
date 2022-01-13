package com.example;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Builder
public class Address {
    @Id
    @GeneratedValue
    private Long id;
    private String city;
    private String province;

    @OneToOne
    @JoinColumn(name = "person_id")
    private Person person;
}
