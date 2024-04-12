package com.jeffcreativesolution.rentacar.service;

import com.jeffcreativesolution.rentacar.model.entity.CarRental;

public interface Payment {
    double payment(CarRental carRental);
}
