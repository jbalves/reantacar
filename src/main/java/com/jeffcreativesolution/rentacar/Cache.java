package com.jeffcreativesolution.rentacar;

import com.jeffcreativesolution.rentacar.service.MessagingService;

import java.util.ArrayList;
import java.util.List;

public class Cache {
    private List<MessagingService> services = new ArrayList<>();

    /**
     * 1. We iterate over each MessagingService in the services list.
     * 2. For each service, we check if its name matches the serviceName (ignoring case).
     * @param serviceName
     * @return
     * 3. If a match is found, we return that service.
     * 4. If no matching service is found, we return null.
     */
    public MessagingService getService(String serviceName) {
        for (MessagingService service: services) {
            if (service.getServiceName().equalsIgnoreCase(serviceName)) {
                return service;
            }
        }
        return null;
    }

    public void addService(MessagingService newService) {
        services.add(newService);
    }
}
