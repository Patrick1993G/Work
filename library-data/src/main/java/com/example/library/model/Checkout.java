package com.example.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "checkouts")
public class Checkout extends BaseEntity {
    @Column(name = "fromDate")
    private LocalDate fromDate;
    @Column(name = "toDate")
    private LocalDate toDate;

    @Column(name="book")
    private Book book;

    @Column(name = "customer")
    private Customer customer;

}
