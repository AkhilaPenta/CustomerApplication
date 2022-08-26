package com.mindtree.pkg.CustomerApplication;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.pkg.CustomerApplication.model.Customer;


@SpringBootApplication
@RestController
public class CustomerApplication {
	@GetMapping("/api/Customer Management")
	public String Welcome()
	{
		return "Customer Management";
	}

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
		ArrayList<Customer>cms=new ArrayList<Customer>();
		cms.add(new Customer(105,"Sony",25000));
		cms.add(new Customer(109,"Akhila",28000));
		cms.add(new Customer(101,"Sushma",23000));
		cms.add(new Customer(106,"Sriya",26000));
		cms.add(new Customer(104,"Pranay",30000));
		cms.add(new Customer(107,"Priya",35000));
		cms.add(new Customer(100,"Akhil",32000));
		cms.add(new Customer(103,"Karthik",34000));
		cms.add(new Customer(102,"Sahana",22000));
		cms.add(new Customer(108,"Kalyani",29000));
		for(Customer c:cms)
		{
		System.out.println(c);
}
	}

}
