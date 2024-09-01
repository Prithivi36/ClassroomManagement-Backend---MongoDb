package com.Classroom.Classroom.Repository;

import com.Classroom.Classroom.Entity.StudentInfo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends MongoRepository<StudentInfo,String> {
    Optional<StudentInfo> findByRegNo(Long regNo);
}
