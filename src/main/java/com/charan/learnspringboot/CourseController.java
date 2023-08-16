package com.charan.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @RequestMapping(value = "/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(new Course(1, "Spring Boot", "Charan"),
                new Course(2, "DevOps", "Charan"),
                new Course(3, "MERN", "Charan"),
                new Course(4, "ML", "Charan"),
                new Course(5, "Java", "Charan"));

    }
}
