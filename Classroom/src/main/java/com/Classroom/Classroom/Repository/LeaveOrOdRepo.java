package com.Classroom.Classroom.Repository;

import com.Classroom.Classroom.Entity.LeaveOrOdRequestEntity;
import com.Classroom.Classroom.Entity.OnDutyEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface LeaveOrOdRepo extends MongoRepository<LeaveOrOdRequestEntity,String> {
    Optional<LeaveOrOdRequestEntity> findByLeaveRequestId(String uniq);

    Optional<List<LeaveOrOdRequestEntity>> findByStudentIdAndDate(Long regNo, LocalDate date);
}
