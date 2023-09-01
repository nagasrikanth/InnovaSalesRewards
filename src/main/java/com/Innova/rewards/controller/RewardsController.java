package com.Innova.rewards.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Innova.rewards.model.B2BCustomer;
import com.Innova.rewards.model.Transaction;
import com.Innova.rewards.service.RewardsService;

import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class RewardsController {

	@Autowired
	private RewardsService rewardsService;

	@GetMapping("/customers")
	public List<B2BCustomer> findCustomerAll() {
		return rewardsService.getCustomerAll();
	}

	@GetMapping("/customers/{id}")
	public ResponseEntity<B2BCustomer> getCustomer(@PathVariable Integer id) {
		B2BCustomer customer = rewardsService.getCustomerById(id);
		if (customer == null)
			return new ResponseEntity<B2BCustomer>(HttpStatus.NOT_FOUND);
		return new ResponseEntity<B2BCustomer>(customer, HttpStatus.OK);
	}

}
