package org.ensa.ensacustomerservice.web;


import org.ensa.ensacustomerservice.dto.CustomerRequestDTO;
import org.ensa.ensacustomerservice.dto.CustomerResponseDTO;
import org.ensa.ensacustomerservice.services.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/api")
public class CustomerRestAPI {

private CustomerService customerService;

    public CustomerRestAPI(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(path = "/customers")
    public List<CustomerResponseDTO> allCustomers(){
        return customerService.listCustomers();
    }
    @PostMapping(path = "/customers")
    public CustomerResponseDTO save(@RequestBody CustomerRequestDTO customerRequestDTO){
        customerRequestDTO.setId(UUID.randomUUID().toString());
        return customerService.save(customerRequestDTO);
    }
    @GetMapping(path = "/customers/{id}")
    public CustomerResponseDTO getCustomer(@PathVariable String id){
        return customerService.getCustomer(id);
    }
    @DeleteMapping(path = "/customers/{id}")
    public void delete(@PathVariable String id){
        customerService.deleteCustomer(id);
    }
}
