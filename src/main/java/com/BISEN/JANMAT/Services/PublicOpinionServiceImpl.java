package com.BISEN.JANMAT.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BISEN.JANMAT.modelsPackage.PublicOpinion;
import com.BISEN.JANMAT.repositoryPackage.PublicOpinionRepository;

@Service
public class PublicOpinionServiceImpl implements PublicOpinionService{

    @Autowired
    PublicOpinionRepository porepo;

    @Override
    public PublicOpinion createPublicOpinion(PublicOpinion opinion) {
        return porepo.save(opinion);
    }

    @Override
    public PublicOpinion getOpinionById(Long id) {
       return porepo.findById(id).orElse(null);
    }

    @Override
    public List<PublicOpinion> getAllOpinion() {
        return porepo.findAll();
    }

    @Override
    public PublicOpinion updateOpinion(Long id, PublicOpinion updatedopinion) {
        PublicOpinion existing = porepo.findById(id).orElse(null);
        if(existing != null){
            existing.setVotes(updatedopinion.getVotes());
            return porepo.save(existing);
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
       porepo.deleteById(id);
    }

}
