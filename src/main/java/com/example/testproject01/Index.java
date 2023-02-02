package com.example.testproject01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Index {

    @GetMapping("/")
    public String viewIndex() {
        
        return ("index");

    }

}
