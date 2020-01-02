package com.neri.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neri.springboot.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
