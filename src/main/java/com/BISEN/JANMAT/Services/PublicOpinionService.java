package com.BISEN.JANMAT.Services;

import java.util.List;

import com.BISEN.JANMAT.modelsPackage.PublicOpinion;

public interface PublicOpinionService {

    PublicOpinion createPublicOpinion(PublicOpinion opinion);
    PublicOpinion getOpinionById(Long id);
    List<PublicOpinion> getAllOpinion();
    PublicOpinion updateOpinion(Long id, PublicOpinion opinion);
    void deleteById(Long id);
}
