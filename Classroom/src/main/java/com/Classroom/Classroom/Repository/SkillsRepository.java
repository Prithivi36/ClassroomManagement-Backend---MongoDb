package com.Classroom.Classroom.Repository;

import com.Classroom.Classroom.Entity.StudentSkills;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SkillsRepository extends MongoRepository<StudentSkills,String> {
    Optional<StudentSkills> findBySkill(String skill);
}
