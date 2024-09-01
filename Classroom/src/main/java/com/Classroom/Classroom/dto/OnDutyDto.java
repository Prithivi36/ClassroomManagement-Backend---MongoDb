package com.Classroom.Classroom.dto;

import com.Classroom.Classroom.Entity.StudentInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OnDutyDto {
    private String _id;
    private LocalDate date;
}
