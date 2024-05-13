package com.javatechie.springawslamda;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

public class OrderHandler extends SpringBootRequestHandler<String, Object> {
	// giving String and expecting as list of items//
	// it helps in seriolize and deseriolize here

}
