package com.example.testproject01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class About {

    @GetMapping("/about")
    public String viewAbout(
            @RequestParam(name="name", 
                defaultValue="World",
                required=false
            )String name, Model model) {
        model.addAttribute("name", name);
        return "about";
    }

}
