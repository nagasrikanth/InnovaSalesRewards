package com.Innova.rewards.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Innova.rewards.model.B2BCustomer;
import com.Innova.rewards.model.Transaction;

@Service
public class RewardsServiceMock {

	private static List<Transaction> transactions = new ArrayList<Transaction>();
	private static long index;
	
	static {
		
		transactions.add( new Transaction(index++, new B2BCustomer(1, "naga"), 100.0, "KOHLS Purchase ", new Date()) );
		transactions.add( new Transaction(index++, new B2BCustomer(2, "srikant"), 50.0, "Macys Purchase", new Date()) );
		transactions.add( new Transaction(index++, new B2BCustomer(3, "modi"), 120.0, "Aldi Purchase", new Date()) );
	
	}
	
	
	public List<Transaction> getAll() {
		return transactions;
	}
	
}
