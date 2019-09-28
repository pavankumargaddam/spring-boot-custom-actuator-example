package org.pk.com.controller;

import org.pk.com.vo.Student;
import org.springframework.boot.actuate.endpoint.web.annotation.ControllerEndpoint;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@ControllerEndpoint(id="student-controller-endpoint")
public class StudentControllerEndPoint {


    @ResponseBody
    @GetMapping("/student")
    public Student getStudentInformation(@RequestParam("name") String name){
        return new Student(11L,name);
    }
}
