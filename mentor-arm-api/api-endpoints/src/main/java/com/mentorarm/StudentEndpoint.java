package com.mentorarm;


import com.mentorarm.dto.StudentDto;
import com.mentorarm.request.StudentCreationRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author William Arustamyan
 */

@Api(value = "Student CRUD endpoint ... ")
@Component
@Path("/student")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class StudentEndpoint {


    private static final Logger logger = LoggerFactory.getLogger(ApplicationVersionEndpoint.class);


    private StudentService studentService;

    private ModelMapper modelMapper;


    @POST
    @Path("/create")
    @ApiOperation(value = "Create student ... ")
    public ApiResponse<StudentDto> create(final StudentCreationRequest creationRequest) {
        logger.info("Create user with name : {} and age {}", creationRequest.getName(), creationRequest.getAge());
        return new ApiResponse<>(modelMapper.map(studentService.create(creationRequest), StudentDto.class), "Successfully created", HttpStatus.OK);
    }

    @Autowired
    public void setStudentService(final StudentService studentService) {
        this.studentService = studentService;
    }


    @Autowired
    public void setModelMapper(final ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }
}
