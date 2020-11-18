package com.lms.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.lms.api.model.Users;

public interface UsersRepository extends MongoRepository<Users, String> {
	Users findByUsername(String username);
}