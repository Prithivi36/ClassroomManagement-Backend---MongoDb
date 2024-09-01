package com.Classroom.Classroom.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "leaveOrOd")
public class LeaveOrOdRequestEntity {

    private String _id;
    private String type;
    private Long studentId;
    private String studentName;
    private LocalDate date;
    private String reason;
    private Boolean status;
    private String leaveRequestId;
    private Boolean denied;


}
