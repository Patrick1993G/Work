package com.example.library.services;

import com.example.library.model.Customer;

public interface CustomerService extends CrudService<Customer,Long>{
    Customer findByLastName(String lastName);
}
