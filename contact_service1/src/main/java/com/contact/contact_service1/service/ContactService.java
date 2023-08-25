package com.contact.contact_service1.service;

import java.util.List;

import com.contact.contact_service1.entity.Contact;



public interface ContactService  {
	 public List<Contact> getContactsOfUser(Long userId);

	}

