package com.example.serverdevplace.controllers;

import com.example.serverdevplace.models.CourseModel;
import com.example.serverdevplace.repos.CourseRepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/date")
public class DateController {

    @Autowired
    CourseRepo courseRepo;

    @GetMapping("/{fac}/{form}")
    public CourseModel getDate(@PathVariable String fac,
                               @PathVariable String form){
        return courseRepo.findByFacultyAndFormat(fac, form);

    }
}
