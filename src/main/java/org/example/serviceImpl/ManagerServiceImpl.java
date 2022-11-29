package org.example.serviceImpl;

import org.example.service.ManagerService;

public class ManagerServiceImpl extends StaffServiceImpl implements ManagerService {
    @Override
    public void hire() {
        System.out.println("hire new staff x");

    }

}
