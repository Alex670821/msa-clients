package com.project.msa_clients.enums;

public enum ClientStatusEnum {

    ACTIVE(  "ACTIVE"),
    INACTIVE(  "INACTIVE");

    private String status;

    ClientStatusEnum(String status){
        this.status = status;
    }


    public String getStatus (){
        return status;
    }
}
