package com.estsoft.hellospring.controller;

import com.estsoft.hellospring.domain.Person;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;

@RestController
public class HiController {

    @GetMapping("/hello")
    public String hi(@RequestParam(value = "name", defaultValue  = "world!") String name) {
        return String.format("Hello %s",name) ;
    }

    // POST localhost:8080/hello
    @PostMapping("/hello")
    public String postTest(@RequestBody String value){
        ObjectMapper objectMapper = new ObjectMapper();
        //json -> java object

        try {
            Person person = objectMapper.readValue(value, Person.class);
            System.out.println(person);
        } catch (JsonProcessingException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(value);
        return value;
    }

}


