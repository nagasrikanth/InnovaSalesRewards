package com.Innova.rewards.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Innova.rewards.model.B2BCustomer;
import com.Innova.rewards.repository.CustomerRepository;

@Service
public class RewardsService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	
	public List<B2BCustomer> getCustomerAll() {
		return customerRepository.findAll();
	}
	
	public B2BCustomer getCustomerById(Integer customerId) {
		return customerRepository.findById(customerId).orElse(null);
	}
	
//	public ResponseEntity<Customer> getCustomerById(Integer customerId) {
//		Customer customer = customerRepository.findById(customerId).orElse(null);
//		return new ResponseEntity<Customer>(customer, HttpStatus.NOT_FOUND);
//	}

}
