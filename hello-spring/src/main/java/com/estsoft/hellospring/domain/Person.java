package com.estsoft.hellospring.domain;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Person {
    private Long id;
    private String name;
    private int age;
    private List<String> hobbies;
}
