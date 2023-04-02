package com.insurence.insurenceapi.DAO;

import com.insurence.insurenceapi.Entity.Claim;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClaimDAOimp implements ClaimDAO {

    public EntityManager entityManager;
    @Autowired
    public ClaimDAOimp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }



    @Override
    public List<Claim> showall() {
        TypedQuery <Claim> typedQuery= entityManager.createQuery("from Claim",Claim.class);
        List<Claim> list=typedQuery.getResultList();
        return list;
    }

    @Override
    public Claim findbyid(int id) {
        Claim claim=entityManager.find(Claim.class,id);

        return claim;
    }

    @Override
    public Claim crate(Claim claim) {
        Claim claim1=entityManager.merge(claim);
        return claim1;
    }

    @Override
    public void update(Claim claim) {
        entityManager.persist(claim);

    }



    @Override
    public void delete(int id) {
        Claim claim=entityManager.find(Claim.class,id);
        entityManager.remove(claim);

    }
}
