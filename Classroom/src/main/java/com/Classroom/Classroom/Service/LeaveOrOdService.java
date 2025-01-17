package com.Classroom.Classroom.Service;

import com.Classroom.Classroom.dto.LeaveOrOdRequestDto;
import com.Classroom.Classroom.dto.StudentDto;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public interface LeaveOrOdService {

    String raiseRequest(LeaveOrOdRequestDto leaveOrOdRequestDto);
    List<LeaveOrOdRequestDto> getAllLeaveRequest();
    String deleteRequest(String requestId);
    String acceptOrDeclineRequest(String requestId);

    List<LeaveOrOdRequestDto> getLeaveRequestByRegNo(Long regNo , LocalDate date);


}
