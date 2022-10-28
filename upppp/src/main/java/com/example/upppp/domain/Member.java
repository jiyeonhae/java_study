package com.example.upppp.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@NoArgsConstructor
@Entity
@Table(name = "Member") //It will enter in member table
                        //all 대문자 작성시 cash가 인식하는 데이터로 활용
public class Member {

    @Id @GeneratedValue //for find exact entity inside container \\ //value auto generate
    private Long id;

    @Column(name = "name")
    private String userName;
    @Column(name = "age")
    private int age;

    public Member(String userName, int age) //복사생성자
    {
        this.userName = userName;
        this.age = age;

    }

}
