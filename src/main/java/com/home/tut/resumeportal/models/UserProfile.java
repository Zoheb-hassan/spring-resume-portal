package com.home.tut.resumeportal.models;

import com.home.tut.resumeportal.enums.ResumeTheme;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Entity
public class UserProfile {

    @Id
    private int id;
    private String userName;
    @Enumerated(EnumType.STRING)
    private ResumeTheme resumeTheme;
    private String resumeSummary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ResumeTheme getResumeTheme() {
        return resumeTheme;
    }

    public void setResumeTheme(ResumeTheme resumeTheme) {
        this.resumeTheme = resumeTheme;
    }

    public String getResumeSummary() {
        return resumeSummary;
    }

    public void setResumeSummary(String resumeSummary) {
        this.resumeSummary = resumeSummary;
    }
}
