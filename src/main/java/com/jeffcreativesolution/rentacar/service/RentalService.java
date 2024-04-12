package com.jeffcreativesolution.rentacar.service;

import com.jeffcreativesolution.rentacar.model.entity.CarRental;
import com.jeffcreativesolution.rentacar.model.entity.Invoice;

public class RentalService {
    private final Payment payment;
    private final TaxService taxService;

    public RentalService(Payment payment, TaxService taxService) {
        this.payment = payment;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){
        double basicPayment = payment.payment(carRental);
        double tax = taxService.tax(payment.payment(carRental));
        var invoice = new Invoice(basicPayment,tax);
        carRental.setInvoice(invoice);
    }
}
