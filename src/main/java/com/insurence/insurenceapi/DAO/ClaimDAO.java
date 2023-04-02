package com.insurence.insurenceapi.DAO;



import com.insurence.insurenceapi.Entity.Claim;

import java.util.List;


public interface ClaimDAO {


    public List<Claim> showall();

    public Claim findbyid(int id);

    public Claim crate(Claim claim);

    public void update(Claim claim);

    public void delete(int id);
}
