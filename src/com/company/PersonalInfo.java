package com.company;

public class PersonalInfo {
    private String name;
    private String email;

    public PersonalInfo() {
    }

    public PersonalInfo(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void addName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void addEmail(String email) {
        this.email = email;
    }
    public String toString(){
        return(getName() +"\n"+getEmail());
    }
}

