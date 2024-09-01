package com.Classroom.Classroom.Entity;

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
@Document("onDuty")
public class OnDutyEntity {
    private String _id;
    private LocalDate date;
    @JsonIgnore
    private List<StudentInfo> onDutyMembers=new ArrayList<>();
}
