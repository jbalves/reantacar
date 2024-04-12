package com.jeffcreativesolution.rentacar.service.impl;

import com.jeffcreativesolution.rentacar.service.TaxService;

public class TaxUSServiceImpl implements TaxService {
    public Double tax(Double basicPayment) {
        if(basicPayment <= 100.0) {
            return basicPayment * 0.15;
        } else {
            return basicPayment * 0.10;
        }
    }
}
