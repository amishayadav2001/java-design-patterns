package com.aurionpro.model;

public class TechLead implements IRole {

    @Override
    public String description() {
        return "A TechLead is a senior technical team member responsible for guiding the technical direction of a project.";
    }

    @Override
    public String responsibility() {
        return "Responsibilities of a TechLead include leading technical discussions, mentoring team members, reviewing code, and ensuring the technical success of the project.";
    }

}
