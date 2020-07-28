package com.example.library.services.implementations;

import com.example.library.model.Checkout;
import com.example.library.services.CheckoutService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
//@Profile({"default","map"})
public class CheckoutServiceMap extends AbstractServiceMap<Checkout,Long> implements CheckoutService {
    @Override
    public Set<Checkout> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Checkout obj) {
        super.delete(obj);
    }

    @Override
    public Checkout save(Checkout obj) {

        return super.save(obj);
    }

    @Override
    public Checkout findById(Long id) {
        return super.findById(id);
    }
}
