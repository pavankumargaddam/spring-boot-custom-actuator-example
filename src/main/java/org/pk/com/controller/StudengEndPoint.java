package org.pk.com.controller;


import org.pk.com.vo.Student;
import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@Endpoint(id = "student-endpoint")
public class StudengEndPoint {

    @ReadOperation
    public Student getStudent(@RequestParam("name") String name){
        return new Student(10L, name);
    }

    @WriteOperation
    public Student createStudent(){
        return new Student(10L,"ram");
    }

    @DeleteOperation
    public void deleteStudent(){
        //write logic here
    }

}
