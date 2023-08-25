package com.user.user_service1.entity;

import java.util.ArrayList;
import java.util.List;



public class User {
	
	    private Long userId;
	    private String name;
	    private String phone;

	    List<Contact> contacts=new ArrayList<>();
	    
	    List<Email> email=new ArrayList<>();

	    public User(Long userId, String name, String phone, List<Contact> contacts,List<Email> email) {
	        this.userId = userId;
	        this.name = name;
	        this.phone = phone;
	        this.contacts = contacts;
	        this.email=email;
	    }


	    public User(Long userId, String name, String phone) {
	        this.userId = userId;
	        this.name = name;
	        this.phone = phone;
	    }

	    public User() {
	    }

	    public Long getUserId() {
	        return userId;
	    }

	    public void setUserId(Long userId) {
	        this.userId = userId;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getPhone() {
	        return phone;
	    }

	    public void setPhone(String phone) {
	        this.phone = phone;
	    }

	    public List<Contact> getContacts() {
	        return contacts;
	    }

	    public void setContacts(List<Contact> contacts) {
	        this.contacts = contacts;
	    }
	    
	    public void setEmails(List<Email> emails) {
	    	this.email=email;
	    }
	}



