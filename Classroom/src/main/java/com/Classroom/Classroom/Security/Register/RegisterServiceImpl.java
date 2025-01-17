package com.Classroom.Classroom.Security.Register;

import com.Classroom.Classroom.Entity.StudentInfo;
import com.Classroom.Classroom.Exception.APIException;
import com.Classroom.Classroom.Repository.StudentRepository;
import com.Classroom.Classroom.Security.Database.RolesEntity;
import com.Classroom.Classroom.Security.Database.SecurityRepo.RoleRepo;
import com.Classroom.Classroom.Security.Database.SecurityRepo.UserRepository;
import com.Classroom.Classroom.Security.Database.UserEntity;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@AllArgsConstructor
public class RegisterServiceImpl {

    private UserRepository userRepository;
    private StudentRepository studentRepository;
    private PasswordEncoder passwordEncoder;
    private RoleRepo roleRepo;

    public String registerNewUser(RequestDto registerDto){

        UserEntity userEntity=new UserEntity();
        userEntity.setUserName(registerDto.getUsername());
        userEntity.setPassword(passwordEncoder.encode(registerDto.getPassword()));
        Set<RolesEntity> rolesEntities=new HashSet<>();
        rolesEntities.add(roleRepo.findByRole("ROLE_STUDENT").get());
        userEntity.setRolesEntities(rolesEntities);
        userRepository.save(userEntity);

        return "Success";
    }
    public String registerNewTeacher(RequestDto registerDto){

        UserEntity userEntity=new UserEntity();
        userEntity.setUserName(registerDto.getUsername());
        userEntity.setPassword(passwordEncoder.encode(registerDto.getPassword()));
        Set<RolesEntity> rolesEntities=new HashSet<>();

        rolesEntities.add(roleRepo.findByRole("ROLE_TEACHER").get());
        userEntity.setRolesEntities(rolesEntities);
        userRepository.save(userEntity);

        return "Success";
    }

    public String makeRep(String reg){
        UserEntity student=userRepository.findByUserName(reg).orElseThrow(()->new APIException(HttpStatus.BAD_REQUEST,"Not Found"));
        Set<RolesEntity> studentRoles=student.getRolesEntities();
        studentRoles.add(roleRepo.findByRole("ROLE_REP").get());
        userRepository.save(student);
        return "success";
    }
}
