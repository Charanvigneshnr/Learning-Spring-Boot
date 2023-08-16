package com.charan.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    private final CurrencyServiceConfiguration configuration;

    public CourseController(CurrencyServiceConfiguration configuration) {
        this.configuration = configuration;
    }

    @RequestMapping(value = "/currency-service")
    public CurrencyServiceConfiguration retrieveAllCourses() {
        return configuration;
    }
}
