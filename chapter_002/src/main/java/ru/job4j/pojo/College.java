package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivan");
        student.setSurname("Petrov");
        student.setMiddleName("Batkovich");
        student.setStartStudy(new Date());

        System.out.println("Student: " + student.getName() +
        " " + student.getSurname() +  " " +  student.getMiddleName() +
        " " + "starts study " +  student.getStartStudy());
    }
}
