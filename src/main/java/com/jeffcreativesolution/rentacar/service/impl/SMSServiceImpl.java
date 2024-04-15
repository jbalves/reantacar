package com.jeffcreativesolution.rentacar.service.impl;

import com.jeffcreativesolution.rentacar.service.MessagingService;

public class SMSServiceImpl implements MessagingService {
    @Override
    public String getMessageBody() {
        return "SMS message";
    }

    @Override
    public String getServiceName() {
        return "SMSServiceName";
    }
}
