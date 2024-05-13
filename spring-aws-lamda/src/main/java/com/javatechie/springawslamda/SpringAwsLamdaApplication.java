package com.javatechie.springawslamda;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.javatechie.springawslamda.dao.orderRepo;
import com.javatechie.springawslamda.domain.Order;

@SpringBootApplication
public class SpringAwsLamdaApplication {

	
	@Autowired
	orderRepo orderRepo;
	
	// create two function as endpoint
	
	public Function<String, String> reverse()
	{
		return input -> new StringBuilder(input).reverse().toString();
	}
	
	@Bean
	public Supplier<List<Order>> order()
	{
		return ()->orderRepo.buildOreder();
	}
	@Bean
	public Function<String,List<Order>> getByName()
	{
		return (input)->orderRepo.buildOreder().stream().filter(i->i.getName().
				endsWith(input)).collect(Collectors.toList());
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAwsLamdaApplication.class, args);
	}

}
