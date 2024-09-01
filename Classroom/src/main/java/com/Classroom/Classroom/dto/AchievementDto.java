package com.Classroom.Classroom.dto;

import com.Classroom.Classroom.Entity.Comments;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AchievementDto {private Long id;
    private String base64Img;
    private Long likes;
    private List<Comments> comments;
    private Long points;
    private String description;
    private StudentAchieveDto studentInfo;

}
