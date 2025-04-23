package com.project.msa_clients.enums;

public enum GenderEnum {


    MALE(  "MALE"),
    FEMALE(  "FEMALE"),
    OTHER(  "OTHER");

    private String gender;

    GenderEnum(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
