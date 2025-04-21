package com.BISEN.JANMAT.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BISEN.JANMAT.modelsPackage.Minister;
import com.BISEN.JANMAT.repositoryPackage.MinisterRepository;

@Service
public class MinisterServiceImpl implements MinisterService {

    @Autowired
    MinisterRepository ministerRepo;

    @Override
    public Minister createMinister(Minister minister) {
       return ministerRepo.save(minister);
    }

    @Override
    public Minister getMinisterById(Long id) {
       return ministerRepo.findById(id).orElse(null);
    }

    @Override
    public List<Minister> getAllMinister() {
        return ministerRepo.findAll();
    }

    @Override
    public Minister updateMinisterById(Long id, Minister updatedminister) {
        Minister existingMinister = ministerRepo.findById(id).orElse(null);
        if(existingMinister != null){
            existingMinister.setName(updatedminister.getName());
            existingMinister.setPosition(updatedminister.getPosition());
            existingMinister.setStartDate(updatedminister.getStartDate());
            existingMinister.setEndDate(updatedminister.getEndDate());
            existingMinister.setParty(updatedminister.getParty());
            return ministerRepo.save(existingMinister);
        }
        return null;
    }

    @Override
    public void deleterMinisterById(Long id) {
        ministerRepo.deleteById(id);
    }

}
