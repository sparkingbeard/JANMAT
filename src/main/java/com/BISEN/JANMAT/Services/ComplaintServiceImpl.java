package com.BISEN.JANMAT.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BISEN.JANMAT.modelsPackage.Complaint;
import com.BISEN.JANMAT.repositoryPackage.ComplaintRepository;

@Service
public class ComplaintServiceImpl implements ComplaintService {
    @Autowired
    ComplaintRepository complaintRepo;

    @Override
    public Complaint saveComplaint(Complaint complaint) {
        return complaintRepo.save(complaint);
    }

    @Override
    public Complaint getComplaint(Long id) {
        return complaintRepo.findById(id).orElse(null);
    }

    @Override
    public List<Complaint> getAllComplaints() {
        return complaintRepo.findAll();
    }

    @Override
    public Complaint updateComplaint(Long id, Complaint updatedComplain) {
        Complaint existingComplain = complaintRepo.findById(id).orElse(null);
        if(existingComplain!= null){
            existingComplain.setSubject(updatedComplain.getSubject());
            existingComplain.setDescription(updatedComplain.getDescription());
            existingComplain.setStatus(updatedComplain.getStatus());
            existingComplain.setTimestamp(updatedComplain.getTimestamp());
            return complaintRepo.save(existingComplain);
        }
        return null;
    }

    @Override
    public void deleteComplaint(Long id) {
        complaintRepo.deleteById(id);
    }

}
