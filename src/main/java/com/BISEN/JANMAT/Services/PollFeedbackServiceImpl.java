package com.BISEN.JANMAT.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BISEN.JANMAT.modelsPackage.PollFeedback;
import com.BISEN.JANMAT.repositoryPackage.PollFeedbackRepository;

@Service
public class PollFeedbackServiceImpl implements PollFeedbackService{

    @Autowired
    PollFeedbackRepository poferepo;

    @Override
    public PollFeedback createPollFeedBack(PollFeedback feedback) {
        return poferepo.save(feedback);
    }

    @Override
    public PollFeedback getPollFeedbackById(Long id) {
       return poferepo.findById(id).orElse(null);
    }

    @Override
    public List<PollFeedback> getAllPollFeedback() {
        return poferepo.findAll();
    }

    @Override
    public void deletePollFeedbackById(Long id) {
        poferepo.deleteById(id);
    }

    @Override
    public PollFeedback updatPollFeedback(Long id, PollFeedback updatedFeedback) {
        PollFeedback existing = poferepo.findById(id).orElse(null);
        if(existing != null){
            existing.setFeedback(updatedFeedback.getFeedback());
            return poferepo.save(existing);
        }
        return null;
    }

}
