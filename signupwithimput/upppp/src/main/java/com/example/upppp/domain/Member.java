package com.example.upppp.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@NoArgsConstructor
@Entity //영속성
@Table(name = "Member") //It will enter in member table
                        //all 대문자 작성시 cash가 인식하는 데이터로 활용
public class Member {

    @Id @GeneratedValue //for find exact entity inside container \\ //value auto generate
    private Long id;

    @Column(name = "name")
    private String userName;
    @Column(name = "age")
    private Integer age; //Integer null값 가능

    public Member(String username, Integer age) //복사생성자
    {
        this.userName = username;
        this.age = age;

    }

}
