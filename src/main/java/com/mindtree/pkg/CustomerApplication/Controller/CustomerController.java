package com.mindtree.pkg.CustomerApplication.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.pkg.CustomerApplication.Service.CustomerService;
import com.mindtree.pkg.CustomerApplication.model.Customer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
public class CustomerController{
@Autowired
private CustomerService service;
@PostMapping("/addCustomer")
public Customer addCustomer(@RequestBody Customer k) {
return service.saveCustomer(k);
}
@PostMapping("/addCustomers")
public List< Customer> addCustomers(@RequestBody List<Customer> m) {
return service.saveCustomer(m);
}
@GetMapping("/Customer")
public List<Customer>findAllCustomers(){
	return service.getCustomer();
}
@GetMapping("/Customers/{Id}")
public Customer findCustomerById(@PathVariable int Id){
	return service.getCustomerById(Id);
}
@GetMapping("/Customer/{Name}")
public Customer findCustomerByName(@PathVariable String name){
	return service.getCustomerByName(name);
}
@GetMapping("/University/{age}")
public Customer findCustomerByage(@PathVariable int age){
	return service.getCustomerByage(age);
}
@PostMapping("/Update")
public Customer UpdateCustomer(@RequestBody Customer k){
	return service.UpdateCustomer(k);
}
@GetMapping("/Delete/{Id}")
public String deleteCustomer(@PathVariable int Id){
	return service.deleteCustomer(Id);
}
}