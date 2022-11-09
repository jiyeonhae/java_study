package com.example.upppp.service;

import com.example.upppp.DTO.MemberDTO;
import com.example.upppp.domain.Member;
import com.example.upppp.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class MemberService {
    @Autowired //instance와의 연결 service 객체 - repository 객체
    private MemberRepository memberRepository;

    public void signUp (MemberDTO dto)
    {

        memberRepository.signUp(new Member(dto.getUserName())); //dto에서 검증한 데이터 -> member로
    }

    public List<Member> findAll(){
        return memberRepository.findAll();
    }

    public List<Member> findName(MemberDTO dto) {return memberRepository.findName(dto.getUserName());}

    public void deleteMember(String userName){
        memberRepository.deleteMember(userName);
    }



}
