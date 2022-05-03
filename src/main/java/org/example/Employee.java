package org.example;


import org.example.validation.EmailCompany;

import javax.validation.constraints.*;

public class Employee {
    @Email(message = "Please use email pattern")
    @EmailCompany
    private String email;

    @Pattern(regexp = "^(\\+7|7|8)?[\\s\\-]?\\(?[489][0-9]{2}\\)?[\\s\\-]?[0-9]{3}[\\s\\-]?[0-9]{2}[\\s\\-]?[0-9]{2}$",
            message = "This value don't look like russian phone number format")
    private String phoneNumber;

    @NotBlank(message = "Name must be not empty")
    @Size(max = 25, message = "Name cannot be greater than 25 symbols")
    private String name;

    @NotBlank(message = "Name must be not empty")
    @Size(max = 30, message = "Surname cannot be greater than 30 symbols")
    private String surname;

    @Min(value = 14, message = "Age must be greater than 14 years old")
    private int age;

    @Min(value = 500, message = "Salary cannot be less than 500$")
    @Max(value = 40000, message = "Salary cannot be greater than 40000$")
    private int salary;

    @NotEmpty(message = "Programming area must be selected")
    private String programmingArea;

    private String[] programmerLanguages;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getProgrammingArea() {
        return programmingArea;
    }

    public void setProgrammingArea(String programmingArea) {
        this.programmingArea = programmingArea;
    }

    public String[] getProgrammerLanguages() {
        return programmerLanguages;
    }

    public void setProgrammerLanguages(String[] programmerLanguages) {
        this.programmerLanguages = programmerLanguages;
    }
}
