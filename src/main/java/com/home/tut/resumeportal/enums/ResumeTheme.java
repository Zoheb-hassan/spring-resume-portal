package com.home.tut.resumeportal.enums;

public enum ResumeTheme {

    MODERN("modern"),
    WILD("wild"),
    MINIMAL("minimal");

    private String representation;

    ResumeTheme(String representation) {
        this.representation = representation;
    }

    @Override
    public String toString() {
        return this.representation;
    }
}
