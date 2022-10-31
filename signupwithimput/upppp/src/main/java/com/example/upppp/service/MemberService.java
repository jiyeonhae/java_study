package com.example.upppp.service;

import com.example.upppp.domain.Member;
import com.example.upppp.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class MemberService {
    @Autowired //instance와의 연결 service 객체 - repository 객체
    private MemberRepository memberRepository;

    public void signUp (Member member)
    {
        memberRepository.signUp(member);
    }

}
