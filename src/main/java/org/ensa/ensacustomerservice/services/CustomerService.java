package org.ensa.ensacustomerservice.services;

import org.ensa.ensacustomerservice.dto.CustomerRequestDTO;
import org.ensa.ensacustomerservice.dto.CustomerResponseDTO;

import java.util.List;

public interface CustomerService {
    CustomerResponseDTO save(CustomerRequestDTO customerRequestDTO);
    CustomerResponseDTO getCustomer(String id);
    CustomerResponseDTO update(CustomerRequestDTO customerRequestDTO);
    List<CustomerResponseDTO> listCustomers();
    void deleteCustomer(String id);

}
