package com.jeffcreativesolution.rentacar.service.impl;

import com.jeffcreativesolution.rentacar.service.MessagingService;

public class EmailServiceImpl implements MessagingService {
    @Override
    public String getMessageBody() {
        return "email message";
    }

    @Override
    public String getServiceName() {
        return "EmailService";
    }
}
