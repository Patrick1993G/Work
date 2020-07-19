package com.example.library.repositories;

import com.example.library.model.Checkout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CheckoutRepo extends JpaRepository<Checkout,Long> {
}
