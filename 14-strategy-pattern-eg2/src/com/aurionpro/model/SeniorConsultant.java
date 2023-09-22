package com.aurionpro.model;

public class SeniorConsultant implements IRole {

    @Override
    public String description() {
        return "A Senior Consultant is a highly experienced professional who provides expert advice and solutions to clients in a specific domain.";
    }

    @Override
    public String responsibility() {
        return "Responsibilities of a Senior Consultant include leading consulting projects, mentoring junior consultants, conducting in-depth research, and delivering high-impact recommendations to clients.";
    }
}
