package com.home.tut.resumeportal;

import com.home.tut.resumeportal.models.UserProfile;
import com.home.tut.resumeportal.repository.UserProfileRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
@Slf4j
@RequiredArgsConstructor
public class HomeController {

    private final UserProfileRepository userProfileRepository;

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
        Optional<UserProfile> userProfile = userProfileRepository.findByUserName(userID);
        userProfile.orElseThrow(() -> new RuntimeException("User Not Found"));
        log.trace("Trace User Profile |{}|", userProfile.get());

        model.addAttribute("userID", userID);
        model.addAttribute("userProfile", userProfile.get());
        String viewString = "profile-templates/" + userProfile.get().getResumeTheme() + "/index";
        return viewString;
    }
}
