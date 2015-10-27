package com.pluralsight.repository;

import com.pluralsight.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tylerkowalewski on 10/25/15.
 */
@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository{
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFirstName("Ty");
        customer.setLastName("Kowalewski");

        customers.add(customer);

        return customers;
    }
}
