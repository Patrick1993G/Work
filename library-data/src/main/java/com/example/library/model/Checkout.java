package com.example.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@Table(name = "checkouts")
public class Checkout extends BaseEntity {
    //@Column(name = "fromDate")
    private LocalDate fromDate;
    //@Column(name = "toDate")
    private LocalDate toDate;

    //@OneToMany(mappedBy = "checkout")
    private Set<Book> books = new HashSet<>();


    //@OneToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "customer_id")
    private Customer customer;

}
