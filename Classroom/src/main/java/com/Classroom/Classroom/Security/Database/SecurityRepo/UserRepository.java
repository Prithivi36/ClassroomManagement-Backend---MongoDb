package com.Classroom.Classroom.Security.Database.SecurityRepo;

import com.Classroom.Classroom.Security.Database.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<UserEntity,String > {
    Optional<UserEntity> findByUserName(String username);
}
