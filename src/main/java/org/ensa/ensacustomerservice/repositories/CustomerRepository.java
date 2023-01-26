package org.ensa.ensacustomerservice.repositories;

import org.ensa.ensacustomerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
