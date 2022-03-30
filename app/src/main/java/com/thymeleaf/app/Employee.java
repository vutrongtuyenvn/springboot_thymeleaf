package com.thymeleaf.app;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Cloneable{
    private int id;
    private String name;
    private String address;
    private String email;
    private String gender;
    private String[] favorites;
    private String position;
}