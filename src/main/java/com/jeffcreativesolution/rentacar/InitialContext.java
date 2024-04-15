package com.jeffcreativesolution.rentacar;

import com.jeffcreativesolution.rentacar.service.impl.EmailServiceImpl;
import com.jeffcreativesolution.rentacar.service.impl.SMSServiceImpl;

public class InitialContext {
    public Object lookup(String serviceName) {
        if (serviceName.equalsIgnoreCase("EmailServiceImpl")) {
            return new EmailServiceImpl();
        } else if (serviceName.equalsIgnoreCase("SMSServiceImpl")) {
            return new SMSServiceImpl();
        }
        return null;
    }
}
