package com.jeffcreativesolution.rentacar.service.impl;

import com.jeffcreativesolution.rentacar.model.entity.CarRental;
import com.jeffcreativesolution.rentacar.service.Payment;

public class PaymentDiscountImpl implements Payment {
    private final Double pricePerDay;
    private final Double pricePerHour;

    public PaymentDiscountImpl(Double pricePerHour, Double pricePerDay) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public double payment(CarRental carRental) {
        long startTime = carRental.getStart().getTime();
        long finishTime = carRental.getFinish().getTime();
        double basicPayment = 0;
        double quantityHoursRental = (double)(finishTime - startTime)/(1000*60*60);

        if (quantityHoursRental <= 12) {
            basicPayment = Math.ceil(quantityHoursRental) * pricePerHour;
        } else {
            basicPayment = Math.ceil(quantityHoursRental) * pricePerDay;
        }

        return basicPayment - 0.5;
    }
}
