package com.example.library.repositories;

import com.example.library.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends JpaRepository<Customer,Long> {
}
