package org.example.spring.models;

import javax.validation.constraints.*;

public class Person {
    private int id;

    @NotEmpty(message = "Имя не должно быть пустым")
    @Size(min = 2, max = 100, message = "Имя должно быть от 2 до 100 символов длиной")
    private String name;

    @Min(value = 18, message = "Вам должно быть большое 18-ти лет")
    @Max(value = 120, message = "Вам больше 120 лет?")
    private int age;


    public Person() {

    }

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
