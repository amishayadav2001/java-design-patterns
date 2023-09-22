package com.aurionpro.model;

public class Consultant implements IRole {

    @Override
    public String description() {
        return "A Consultant is an expert in a specific domain who provides guidance and advice to clients.";
    }

    @Override
    public String responsibility() {
        return "Responsibilities of a Consultant include analyzing client needs, recommending solutions, and helping clients achieve their goals.";
    }

}
