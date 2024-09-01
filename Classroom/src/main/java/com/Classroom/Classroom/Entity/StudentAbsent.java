package com.Classroom.Classroom.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "studentAbsent")
public class StudentAbsent {
    private String _id;
    private LocalDate date;
    private int hour;
    @JsonIgnore
    private List<StudentInfo> studentInfos=new ArrayList<>();

}
