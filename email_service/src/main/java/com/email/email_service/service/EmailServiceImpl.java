package com.email.email_service.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.email.email_service.entity.Email;




@Service
public class EmailServiceImpl implements EmailService  {
	
	//fake list of emails
	
	List<Email> list = List.of(
            new Email(1L, "omkar@gmail.com", "omkar",1311L),
            new Email(2L, "abhi@gmail.com", "abhi",1312L),
            new Email(3L, "raj@gmail.com", "raj",1313L)
    );
	
	@Override
    public List<Email> getEmail(Long userId) {
        return list.stream().filter(email -> email.getId().equals(userId)).collect(Collectors.toList());
    }
	
}
