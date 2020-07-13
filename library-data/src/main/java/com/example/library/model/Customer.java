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
@Table(name = "customers")
public class Customer extends Person {

    @Builder
    public Customer(Long id, String name, String surname, Byte age, Checkout checkout) {
        super(id, name, surname, age);
        this.checkout = checkout;
    }




    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "checkout_id")
    private Checkout checkout;
}
