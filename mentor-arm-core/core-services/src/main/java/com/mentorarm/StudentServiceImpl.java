package com.mentorarm;


import com.mentorarm.entity.Student;
import com.mentorarm.request.StudentCreationRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author William Arustamyan
 */

@Service
public class StudentServiceImpl implements StudentService {

    private static final Logger logger = LoggerFactory.getLogger(StudentService.class);


    @PersistenceContext
    private EntityManager entityManager;


    private StudentRepository studentRepository;

    @Transactional
    @Override
    public Student create(StudentCreationRequest creationRequest) {

        final Student student = new Student();
        student.setAge(creationRequest.getAge());
        student.setName(creationRequest.getName());

        Student savedInstance = studentRepository.save(student);
        logger.debug("Student with id {} saved ... ", savedInstance.getId());
        entityManager.flush();
        return student;
    }

    @Autowired
    public void setStudentRepository(final StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
}
