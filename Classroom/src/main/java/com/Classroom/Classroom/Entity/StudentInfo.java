package com.Classroom.Classroom.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "baseStudentData")
public class StudentInfo {

    private String _id;
    private Long regNo;
    private String studentName;
    private String branch;
    private Long phone;
    private String mail;
    private String linkedin;
    private String instagram;
    private Long fatherNumber;
    private Long motherNumber;
    private String bloodGroup;
    private double  cgpa;
    private int studentConcern;
    private String password;

    private List<StudentSkills> studentSkills;

    private List<OnDutyEntity> onDutyEntities;

    private List<StudentAbsent> absentList;

    private List<LeaveOrOdRequestEntity> leaveOrOdRequests;

    @JsonIgnore
    private List<Achievements> achievements;

}
