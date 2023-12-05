package com.luanleiteleao.estacionamentosystem.domain.repository;

import com.luanleiteleao.estacionamentosystem.domain.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer,Long> {
}
