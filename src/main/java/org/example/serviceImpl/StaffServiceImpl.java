package org.example.serviceImpl;

import org.example.service.StaffService;

public class StaffServiceImpl implements StaffService {
    private String name;
    private String employee_id;
    private String date_of_birth;
    private Boolean active;

    @Override
    public void leave() {
        System.out.println("sell product to customer");

    }

    @Override
    public void request_raise() {

    }
}
