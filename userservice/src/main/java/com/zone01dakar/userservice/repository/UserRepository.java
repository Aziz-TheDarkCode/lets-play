package com.zone01dakar.userservice.repository;
import org.springframework.data.mongodb.repository.MongoRepository;


import com.zone01dakar.userservice.models.User;
public interface UserRepository extends MongoRepository<User,String> {

}
