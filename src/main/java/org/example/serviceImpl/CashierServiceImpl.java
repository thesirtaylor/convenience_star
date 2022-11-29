package org.example.serviceImpl;

import org.example.service.CashierService;

public class CashierServiceImpl extends StaffServiceImpl implements CashierService {

    @Override
    public void sell() {
        System.out.println("sell product to customer");
    }

    @Override
    public void dispense_receipt() {
        System.out.println("dispense receipt to customer");

    }

}
