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
@Document(collection = "achievements")
public class Achievements {
    private String _id;
    private String base64Img;
    private Long likes;
    private List<Comments> comments;
    private Long points;
    private String description;
    @JsonIgnore
    private StudentInfo studentInfo;
}
