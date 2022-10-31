package com.example.upppp.repository;

//import com.example.upppp.domain.Member;
//import org.springframework.data.jpa.repository.JpaRepository;
import com.example.upppp.domain.Member;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository //annotation that assign this class as repository
//public interface MemberRepository extends JpaRepository<Member, Long>
//{
                                                             //created in newMember method

//}
//https://ryusae.tistory.com/7 cache, cookie, session
//                            cache delete -> temporary file
//                            cookie delete -> sign out, setting
public class MemberRepository {
    @PersistenceContext //영속성 -> into bean
    private EntityManager em; //repository -> EM (container & cache) -> DB

    public void signUp (Member member)
    {
        em.persist(member);
    }

}
