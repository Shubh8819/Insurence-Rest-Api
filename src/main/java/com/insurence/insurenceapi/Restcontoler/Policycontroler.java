package com.insurence.insurenceapi.Restcontoler;


import com.insurence.insurenceapi.Entity.InsurancePolicyEntity;
import com.insurence.insurenceapi.Serviceleyer.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Policycontroler {


    public PolicyService policyService;



    @Autowired
    public Policycontroler(PolicyService policyService) {
        this.policyService = policyService;

    }


    @GetMapping("/policy")
    public List<InsurancePolicyEntity> showall(){

        return policyService.getAll();

    }

    @GetMapping("/policy/{policyId}")
    public InsurancePolicyEntity policy(@PathVariable(name = "policyId") int id){
        return policyService.findbyid(id);
    }

    @PostMapping("/policy")
    public InsurancePolicyEntity create(@RequestBody InsurancePolicyEntity policy1){
        return policyService.crate(policy1);
    }
    @PutMapping("/policy")
    public void update(@RequestBody InsurancePolicyEntity policy1){
         policyService.crate(policy1);
    }

    @DeleteMapping("/policy/{policyId}")
    public void remove(@PathVariable(name ="policyId" ) int id){
        InsurancePolicyEntity policy=policyService.findbyid(id);
        policyService.delete(id);
    }
}
