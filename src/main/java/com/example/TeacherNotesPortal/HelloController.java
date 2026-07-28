package com.example.TeacherNotesPortal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("")
    public String greeting()
    {
        return "Welcome to Our Project Group ISE";
    }
}
