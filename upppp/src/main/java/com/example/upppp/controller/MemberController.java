package com.example.upppp.controller;

import com.example.upppp.DTO.MemberDTO;
import com.example.upppp.domain.Member;
import com.example.upppp.repository.MemberRepository;
import com.example.upppp.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class MemberController {

    @Autowired //bring(wire) repositoried class to this variable
    private MemberService memberService;

    @GetMapping("new") //데이터 참조만 -- view //new일때 mapping된 함수 호출
    public String newMember() //localhost/new page 접속 후 추가됨
    {

        System.out.println("create member");
        return "new";
    }

    @PostMapping ("create") //데이터 변경가능
    public String createMember(@Valid MemberDTO dto) //valid 검증
    {
       // Member member = new Member("Mass",12); //shift alt enter to import Memberclass
       //memberRepository.save(member);
       // memberService.signUp(member);
        memberService.signUp(dto);
        return "redirect:/";
    }

    @GetMapping("find")
    public String find(Model model){
        model.addAttribute("object", new MemberDTO());
        return "find";
    }

    @PostMapping("findName")
    public String findName(Model model, MemberDTO dto){

        List<Member> members = memberService.findName(dto); //동일이름 있을 수 있어서 리스트로 받을것
                                                        //Primary Key가 있어야 분류가능 주키 / Foreign Key 외래키
        model.addAttribute("object", members);
        return "findAll";
    }


    @GetMapping("findAll")
    public String findAll(Model model)
    {
        List<Member> members = memberService.findAll(); //위 List랑 다른 container, Member물체를 담았지만
        model.addAttribute("object", members);
        return "findAll";
    }

    @GetMapping("deleteMember")
    public String deleteMember()
    {
        return "deleteMember";
    }

    @PostMapping("deleteMember")
    public String deleteMember(String userName)
    {
        memberService.deleteMember(userName);
        return "redirect:/";
    }
}
