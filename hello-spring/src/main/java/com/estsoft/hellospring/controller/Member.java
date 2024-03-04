package com.estsoft.hellospring.controller;


import jakarta.persistence.*;
import lombok.Getter;
//import org.springframework.data.annotation.Id;

@Getter
@Entity
//@Access(AccessType.FIELD)
public class Member {
//    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false)
    private Long id;		// DB 테이블의 id와 컬럼 매칭

    @Column(name = "name", nullable = false)
    private String name;	// DB 테이블의 name과 컬럼 매칭

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
