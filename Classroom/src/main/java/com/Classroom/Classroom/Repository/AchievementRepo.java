package com.Classroom.Classroom.Repository;

import com.Classroom.Classroom.Entity.Achievements;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AchievementRepo extends MongoRepository<Achievements,String> {
}
