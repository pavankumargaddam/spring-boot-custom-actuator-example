package org.pk.com.controller;

import org.pk.com.vo.Student;
import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class StudentRestControllerEndPoint {

    @Component
    @RestControllerEndpoint(id="student-rest-controller-endpoint")
    public class StudentControllerEndPoint {

        @GetMapping("/student")
        public ResponseEntity<Student> getStudentInformation(@RequestParam("name") String name){
            return new ResponseEntity<>(new Student(12L,name), HttpStatus.OK);
        }
    }

}
