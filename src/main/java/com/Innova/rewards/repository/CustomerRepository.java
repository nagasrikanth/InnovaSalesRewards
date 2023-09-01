package com.Innova.rewards.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Innova.rewards.model.B2BCustomer;

@Repository
public interface CustomerRepository extends JpaRepository<B2BCustomer, Integer>{

}
