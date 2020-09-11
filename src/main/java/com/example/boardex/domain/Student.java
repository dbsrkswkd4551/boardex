package com.example.boardex.domain;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode(of = "studentNo")
public class Student {

    private int studentNo;
    private String name;
}
