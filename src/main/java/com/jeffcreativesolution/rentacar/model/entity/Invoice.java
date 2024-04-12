package com.jeffcreativesolution.rentacar.model.entity;

public class Invoice {
    private Double basicPayment;
    private Double tax;
    private final Double amountPayment;

    public Double getAmountPayment() {
        return amountPayment;
    }



    public Invoice(Double basicPayment, Double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
        this.amountPayment = this.basicPayment + this.tax;
    }

    public Double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(Double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }
}
