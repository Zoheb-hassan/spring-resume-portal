package com.home.tut.resumeportal.models;

import com.home.tut.resumeportal.enums.ResumeTheme;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@ToString
@Getter
@Setter
public class UserProfile {

    @Id
    private int id;
    private String userName;
    @Enumerated(EnumType.STRING)
    private ResumeTheme resumeTheme;
    private String resumeSummary;
    private String firstName;
    private String lastName;
    private String email;
    private String designation;
    private String phone;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "job_id")
    private List<Job> jobs = new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "education_id")
    private List<Education> educations = new ArrayList<>();
    @ElementCollection(targetClass = String.class)
    private List<String> skills = new ArrayList<>();

    private void addJob(Job job) {
        jobs.add(job);
    }

    private void addEducation(Education education) {
        educations.add(education);
    }

    private void addSkill(String skill) {
        skills.add(skill);
    }

}
