package com.example.springtraining.student;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.Constraint;
import javax.validation.constraints.*;

@Entity
@Table
public class Student  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false , unique = true )
    private Long id;

//    @NotEmpty
//    @NotBlank
//    @Column(name = "name")
//    @NonNull
    String name;
//
//    @NotEmpty
//    @NotBlank
//    @Column(name = "last-name")
//    @NonNull
    String lastName;

//    @NotEmpty
//    @NotBlank
//    @Column(name = "phone-num")
//    @NonNull
    String phoneNum;

//    @NotEmpty
//    @NotBlank
//    @Column(name = "national-code")
//    @Size(message = "فرمت نامناسب", min = 10 , max = 10)
    String nationalCode;

//    @Email @NotEmpty
//    @NotBlank
//    @Column(name = "email")
//    @NonNull
    String email;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
