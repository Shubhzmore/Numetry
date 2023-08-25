package com.user.user_service1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.user_service1.entity.User;


@Service
public class UserServiceImpl implements UserService {
	
	//fake user list
	List<User> list = List.of(
            new User(1311L, "omkar jadhav", "2352"),
            new User(1312L, "Abhi jadhav", "9999"),
            new User(1313L, "raj jadhav", "7777")
    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}