package com.jeffcreativesolution.rentacar.service.impl;

import com.jeffcreativesolution.rentacar.service.TaxService;

public class TaxBrazilServiceImpl implements TaxService {
    public Double tax(Double basicPayment) {
        if(basicPayment <= 100.0) {
            return basicPayment * 0.20;
        } else {
            return basicPayment * 0.15;
        }
    }
}
