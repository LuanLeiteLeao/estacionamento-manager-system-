package com.luanleiteleao.estacionamentosystem.service;

import com.luanleiteleao.estacionamentosystem.domain.entity.Customer;
import com.luanleiteleao.estacionamentosystem.domain.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    public Customer save(Customer customer){
        Customer customerSalved =  repository.save(customer);
        return customerSalved;
    }
}
