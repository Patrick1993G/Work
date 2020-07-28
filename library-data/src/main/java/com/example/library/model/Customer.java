package com.example.library.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
//@Table(name = "customers")
public class Customer extends Person {

    @Builder
    public Customer(Long id, String name, String surname, Byte age,String idCard, Checkout checkout) {
        super(id, name, surname, age,idCard);
        this.checkout = checkout;
    }

    //@OneToOne(mappedBy = "customer",cascade = CascadeType.ALL)
    private Checkout checkout;
}
