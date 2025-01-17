package com.Classroom.Classroom.dto;

import com.azure.core.annotation.Get;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentAchieveDto {
    private String _id;
    private String studentName;
    private String branch;
}
