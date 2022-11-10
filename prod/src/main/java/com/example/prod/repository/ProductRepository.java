package com.example.prod.repository;

import com.example.prod.domain.ImageProduct;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

//https://codevang.tistory.com/258 -- repository vs service
//DB io등 외부파일 처리 Only CRUD
@Repository
public class ProductRepository {
    @PersistenceContext //https://www.baeldung.com/hibernate-entitymanager
    private EntityManager em;

    public void save(ImageProduct product)
    {
        em.persist(product);
    }

    //JPQL concluded
}
