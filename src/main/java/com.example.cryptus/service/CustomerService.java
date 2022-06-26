package com.example.cryptus.service;

import com.example.cryptus.model.Customer;
import com.example.cryptus.model.User;
import com.example.cryptus.repository.CustomerRepository;


import com.example.cryptus.service.Exceptions.RegistrationFailedException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    private final Logger logger =  LogManager.getLogger(CustomerService.class);
    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
        logger.info("New CustomerService");
    }

    public void storeCustomer(Customer customer) {
        customerRepository.storeCustomer(customer);

    }


    public void update(Customer customer) {
        customerRepository.update(customer);

    }


    public void delete(int id) {
        customerRepository.delete(id);

    }
    public Optional<Customer> findCustomerByName(String name){
        return customerRepository.findCustomerByName(name);

    }

    public Optional <Customer> findCustomerById (int id){
        return customerRepository.findCustomerById(id);
    }

    public List<Customer> list(){
        return customerRepository.list();
    }

//    Daan: I added this method in order to check if a new registration conflicts with an already existing customer
//    and if not, to store the newly registered customer
//    the method findCustomerByUserName() is not yet written
    /*public Customer register (Customer customer) {
        Optional<Customer> existing = customerRepository.findCustomerByUserName(customer.getUserName());
        if(existing.isPresent()) {
            throw new RegistrationFailedException();
        }
        customerRepository.storeCustomer(customer);
        return customer;
    }*/

}
