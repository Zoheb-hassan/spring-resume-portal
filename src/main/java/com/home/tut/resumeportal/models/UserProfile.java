package com.home.tut.resumeportal.models;

import com.home.tut.resumeportal.enums.ResumeTheme;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

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

}
