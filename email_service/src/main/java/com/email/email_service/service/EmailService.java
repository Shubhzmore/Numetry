package com.email.email_service.service;

import java.util.List;

import com.email.email_service.entity.Email;

public interface EmailService {
	
	public List<Email> getEmail(Long userId);
	

}
