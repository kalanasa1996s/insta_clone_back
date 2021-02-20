package com.Insta.insta.repository;

import com.Insta.insta.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User , Integer> {


}
