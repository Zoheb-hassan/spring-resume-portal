package com.home.tut.resumeportal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getHello() {
        return "Hello";
    }

    @GetMapping("/edit")
    public String edit() {
        return "edit";
    }


    @GetMapping("/view/{userID}")
    public String getView(@PathVariable String userID, Model model) {
        model.addAttribute("userID", userID);
        return "profile";
    }
}
