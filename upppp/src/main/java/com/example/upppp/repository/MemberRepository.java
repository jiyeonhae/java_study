package com.example.upppp.repository;

//import com.example.upppp.domain.Member;
//import org.springframework.data.jpa.repository.JpaRepository;
import com.example.upppp.DTO.MemberDTO;
import com.example.upppp.domain.Member;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

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

    public List<Member> findAll() {
        return em.createQuery("select m from Member m", Member.class).getResultList();
                                //직접 쿼리생성
    }
    public List<Member> findName(String userName){
        return em.createQuery("select m from Member m where m.userName = :name", Member.class).setParameter("name", userName).getResultList();
                               //위 매개변수 String 변수명을 쿼리의 name으로 설정하겠다 - 그 name이 m의 username과 같다면 결과를 리스트로 출력하라
    }

    public void deleteMember(String userName)
    {
        List<Member> members = findName(userName);
        for (int i = 0; i < members.size(); ++i) {
            em.remove(members.get(i));

        }
    }

}
