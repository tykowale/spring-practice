package com.pluralsight.service;

import com.pluralsight.model.Customer;

import java.util.List;

/**
 * Created by tylerkowalewski on 10/25/15.
 */
public interface CustomerService {
    List<Customer> findAll();
}
