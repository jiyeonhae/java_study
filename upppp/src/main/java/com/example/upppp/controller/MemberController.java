package com.example.upppp.controller;

import com.example.upppp.domain.Member;
import com.example.upppp.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

    @Autowired //bring(wire) repositoried class to this variable
    private MemberRepository memberRepository;

    @GetMapping("new") //데이터 참조만 //new일때 mapping된 함수 호출
    public String newMember() //localhost/new page 접속 후 추가됨
    {

        System.out.println("create member");
        return "new";
    }

    @PostMapping ("create") //데이터 변경가능
    public String createMember()
    {
        Member member = new Member("Mass",12); //shift alt enter to import Memberclass
        memberRepository.save(member);
        return "create";
    }


}
