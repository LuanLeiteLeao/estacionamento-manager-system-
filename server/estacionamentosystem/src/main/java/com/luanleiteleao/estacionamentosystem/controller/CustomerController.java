package com.luanleiteleao.estacionamentosystem.controller;

import ch.qos.logback.core.net.server.Client;
import com.luanleiteleao.estacionamentosystem.domain.entity.Customer;
import com.luanleiteleao.estacionamentosystem.dto.CustomerDTO;
import com.luanleiteleao.estacionamentosystem.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/1.0/customer")
public class CustomerController {

    @Autowired
    CustomerService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<String>  save(@Valid @RequestBody CustomerDTO customer){
        return  ResponseEntity.ok("oi");
        //
//        return ResponseEntity.ok(
//                service.save(customer)
//        );
    }
    


}
