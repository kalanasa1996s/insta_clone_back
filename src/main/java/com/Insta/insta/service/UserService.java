package com.Insta.insta.service;


import com.Insta.insta.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> getAllUser();
    User addUser(User user);
    User findUser(int id);
}
