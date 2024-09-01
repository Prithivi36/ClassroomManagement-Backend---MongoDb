package com.Classroom.Classroom.Security.Database;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "users")
public class UserEntity {
    private String _id;
    private String userName;
    private String password;

    private Set<RolesEntity> rolesEntities;
}
