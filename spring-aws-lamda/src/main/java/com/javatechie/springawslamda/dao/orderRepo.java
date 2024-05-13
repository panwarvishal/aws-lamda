package com.javatechie.springawslamda.dao;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.javatechie.springawslamda.domain.Order;

@Repository
public class orderRepo {
	
	
	public List<Order> buildOreder()
	{
		return Stream.of(new Order(1, "Vishal", 10, 23),
				new Order(2, "MONU", 11, 24)).collect(Collectors.toList());
		
	}

}
