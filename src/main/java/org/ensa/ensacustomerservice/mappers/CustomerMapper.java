package org.ensa.ensacustomerservice.mappers;

import org.ensa.ensacustomerservice.dto.CustomerRequestDTO;
import org.ensa.ensacustomerservice.dto.CustomerResponseDTO;
import org.ensa.ensacustomerservice.entities.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerResponseDTO customerToCustomerResponseDTO(Customer customer);
    Customer customerRequestDTOCustomer(CustomerRequestDTO customerRequestDTO);





}
