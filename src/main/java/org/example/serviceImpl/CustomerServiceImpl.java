package org.example.serviceImpl;

import org.example.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
    private String customer_name;

    @Override
    public void buy() {
        System.out.println("buy product x from cashier y");
    }
}
