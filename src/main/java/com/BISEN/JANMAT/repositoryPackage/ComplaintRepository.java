package com.BISEN.JANMAT.repositoryPackage;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BISEN.JANMAT.modelsPackage.Complaint;

public interface ComplaintRepository extends JpaRepository<Complaint, Long>{
    
}
