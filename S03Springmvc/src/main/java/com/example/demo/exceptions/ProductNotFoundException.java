package com.example.demo.exceptions;

public class ProductNotFoundException extends RuntimeException{

	public ProductNotFoundException(String id) {
		super("Product with id " + id + "is not Found.Pls Give another id!!");
	}

}
