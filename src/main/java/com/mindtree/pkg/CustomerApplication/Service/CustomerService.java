package com.mindtree.pkg.CustomerApplication.Service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mindtree.pkg.CustomerApplication.model.*;
import com.mindtree.pkg.CustomerApplication.Repository.*;
@Service
public class CustomerService{
@Autowired
private CustomerRepository repository;
public Customer saveCustomer(Customer cs) {
	return repository.save(cs);
	}
public List<Customer>saveCustomer(List<Customer>up){
	return repository.saveAll(up);
}
public List<Customer>getCustomer(){
	return repository.findAll();
}
public Customer getCustomerById(int Id) {
	return repository.findById(Id).orElse(null);
}
public Customer getCustomerByName(String name) {
	return repository.findByName(name);
}
public Customer getCustomerByage(int age) {
	return repository.findByage(age);
}
public String deleteCustomer(int Id) {
	repository.deleteById(Id);
	return "Customer is removed"+Id;
}
public Customer UpdateCustomer(Customer k) {
	Customer es=repository.findById(k.getId()).orElse(null);  es.setName(k.getName()); 
	es.setage(k.getAge());
return repository.save(es);
}
}