package com.OneToOne.demo.Repository;

import com.OneToOne.demo.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
