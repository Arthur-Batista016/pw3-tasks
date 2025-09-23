package br.com.etechas.tasks.entity.enums;

public enum RoleEnum {
    ADMIN,
    USER;

    public String getAuthoricity(){
        return "ROLE" + name();
    }
}
