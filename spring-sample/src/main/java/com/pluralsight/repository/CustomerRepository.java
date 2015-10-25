package com.pluralsight.repository;

import com.pluralsight.model.Customer;

import java.util.List;

/**
 * Created by tylerkowalewski on 10/25/15.
 */
public interface CustomerRepository {
    List<Customer> findAll();
}
