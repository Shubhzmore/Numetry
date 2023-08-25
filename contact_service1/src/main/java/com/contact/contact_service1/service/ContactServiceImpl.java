package com.contact.contact_service1.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.contact_service1.entity.Contact;



@Service
public class ContactServiceImpl implements ContactService {

    //fake list of contacts

    List<Contact> list = List.of(
            new Contact(1L, "omkar@gmail.com", "omkar", 1311L),
            new Contact(2L, "abhi@gmail.com", "abhi", 1312L),
            new Contact(3L, "raj@gmail.com", "raj", 1313L),
            new Contact(4L, "sharvil@gmail.com", "sharvil", 1314L)
    );


    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
