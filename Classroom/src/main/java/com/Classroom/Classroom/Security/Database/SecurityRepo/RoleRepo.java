package com.Classroom.Classroom.Security.Database.SecurityRepo;

import com.Classroom.Classroom.Security.Database.RolesEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepo extends MongoRepository<RolesEntity,String> {
    Optional<RolesEntity> findByRole(String role);
}
