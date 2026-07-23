package com.Basic.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Basic.Entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
