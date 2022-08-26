package com.mindtree.pkg.CustomerApplication.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.mindtree.pkg.CustomerApplication.model.*;
public interface CustomerRepository extends JpaRepository<Customer,Integer>{
	Customer findByName(String name);

	Customer findByage(int age);

	
}