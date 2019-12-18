package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String Name;
    private String Surname;
    private  String middleName;

    public Date getStartStudy() {
        return startStudy;
    }

    public void setStartStudy(Date startStudy) {
        this.startStudy = startStudy;
    }

    private Date startStudy;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
}
