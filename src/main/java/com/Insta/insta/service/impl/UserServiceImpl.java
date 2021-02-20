package com.Insta.insta.service.impl;

import com.Insta.insta.entity.User;
import com.Insta.insta.repository.UserRepository;
import com.Insta.insta.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUser() {
        return null;
    }

    @Override
    public User addUser(User user) {
        return null;
    }

    @Override
    public User findUser(int id) {
        userRepository.findById(id);
        return null;
    }
}
