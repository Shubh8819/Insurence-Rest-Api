package com.insurence.insurenceapi.DAO;

import com.insurence.insurenceapi.Entity.InsurancePolicyEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PolicyDaoImple  implements PolicyDao {


    private EntityManager entityManager;

    @Autowired
    public PolicyDaoImple(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<InsurancePolicyEntity> showall() {
        TypedQuery<InsurancePolicyEntity> typedQuery=entityManager.createQuery("from InsurancePolicyEntity",InsurancePolicyEntity.class);
        List<InsurancePolicyEntity>list=typedQuery.getResultList();
        return  list;
    }

    @Override
    public InsurancePolicyEntity findbyid(int id) {
        InsurancePolicyEntity policy=entityManager.find(InsurancePolicyEntity.class,id);
        return policy;
    }

    @Override
    public InsurancePolicyEntity crate(InsurancePolicyEntity polycy) {

       return entityManager.merge(polycy) ;


    }

    @Override
    public void update(InsurancePolicyEntity policy) {
         entityManager.persist(policy);   ;
    }

    @Override
    public void delete(int id) {

        InsurancePolicyEntity policy=entityManager.find(InsurancePolicyEntity.class,id);
        entityManager.remove(policy);

    }
}
