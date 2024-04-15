package com.jeffcreativesolution.rentacar;

import com.jeffcreativesolution.rentacar.service.MessagingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RentacarApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentacarApplication.class, args);

		MessagingService service = ServiceLocator.getService("EmailServiceImpl");
		String email = service.getMessageBody();

		MessagingService smsService = ServiceLocator.getService("SMSServiceImpl");
		String sms = smsService.getMessageBody();

		MessagingService emailService = ServiceLocator.getService("EmailServiceImpl");
		String newEmail = emailService.getMessageBody();

		System.out.println("service: " + email);
		System.out.println("smsService: " + sms);
		System.out.println("emailService: " + newEmail);
	}

}
