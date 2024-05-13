package com.javatechie.springawslamda;

import java.util.function.Consumer;

import org.springframework.stereotype.Component;

@Component
public class MyConsumer implements Consumer<String> {

	@Override
	public void accept(String t) {

System.out.println("Recieved>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>."+ t);		
	}

}
