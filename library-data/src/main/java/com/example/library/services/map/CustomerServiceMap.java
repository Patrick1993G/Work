package com.example.library.services.map;

import com.example.library.model.Customer;
import com.example.library.services.CustomerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
@Profile({"default","map"})
public class CustomerServiceMap extends AbstractServiceMap<Customer,Long> implements CustomerService {
    @Override
    public Customer findByLastName(String lastName) {
        return this.findByLastName(lastName);
    }

    @Override
    public Set<Customer> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
      super.deleteById(id);
    }

    @Override
    public void delete(Customer obj) {
        super.delete(obj);
    }

    @Override
    public Customer save(Customer obj) {
        return super.save(obj);
    }

    @Override
    public Customer findById(Long id) {
        return super.findById(id);
    }
}
