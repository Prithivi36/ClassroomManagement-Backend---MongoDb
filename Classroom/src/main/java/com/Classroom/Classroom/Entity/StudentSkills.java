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
@Document(collection = "StudentSkills")
public class StudentSkills {
    private String _id;
    private String skill;
    @JsonIgnore
    private List<StudentInfo> studentInfos;
}
