package ru.job4j.oop;

public class College {
    //(down casting)
    // создаем объекта класса Freshman.
    Freshman fr = new Freshman();
    // делаем приведение к типу родителя Student.
    Student nStudent = fr;
    // делаем приведение к типу родителя Object.
    Object obfr = nStudent;
}
