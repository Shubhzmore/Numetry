package com.email.email_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.email.email_service.entity.Email;
import com.email.email_service.service.EmailService;

@RestController
@RequestMapping("/email")
public class EmailController {
	
	@Autowired
	private EmailService emailService;
	
	
	@RequestMapping("/user/{userId}")
    public List<Email> getContacts(@PathVariable("userId") Long userId) {
        return this.emailService.getEmail(userId);
    }

}
