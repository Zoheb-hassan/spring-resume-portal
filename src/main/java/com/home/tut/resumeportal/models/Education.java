package com.home.tut.resumeportal.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
@Getter
@Setter
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String college;
    private String qualification;
    private LocalDate startDate;
    private LocalDate endDate;
    private String summary;

    public String getFormattedStartDate() {
        return startDate.format(DateTimeFormatter.ofPattern("MMM yyyy"));
    }

    public String getFormattedEndDate() {
        return endDate.format(DateTimeFormatter.ofPattern("MMM yyyy"));
    }
}
