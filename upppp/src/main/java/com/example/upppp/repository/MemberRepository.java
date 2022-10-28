package com.example.upppp.repository;

import com.example.upppp.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //annotation that assign this class as repository
public interface MemberRepository extends JpaRepository<Member, Long>
{
                                                             //created in newMember method


}
