package com.mentorarm;


import com.mentorarm.entity.Student;
import com.mentorarm.request.StudentCreationRequest;

/**
 * @author William Arustamyan
 */


public interface StudentService {

    Student create(StudentCreationRequest creationRequest);
}
