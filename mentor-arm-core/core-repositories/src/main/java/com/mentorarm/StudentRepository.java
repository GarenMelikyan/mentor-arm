package com.mentorarm;


import com.mentorarm.entity.Student;
import org.springframework.data.repository.CrudRepository;

/**
 * @author William Arustamyan
 */


public interface StudentRepository extends CrudRepository<Student, Long> {
}
