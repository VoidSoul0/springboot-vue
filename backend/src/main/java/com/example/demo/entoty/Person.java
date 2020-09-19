package com.example.demo.entoty;

import lombok.Data;

import java.io.Serializable;

@Data
public class Person implements Serializable {
    private Integer id;

    private String name;

    private String sex;

    private Integer age;

    private static final long serialVersionUID = 1L;
}
