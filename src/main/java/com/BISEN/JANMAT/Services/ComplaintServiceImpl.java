package com.BISEN.JANMAT.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BISEN.JANMAT.modelsPackage.Complaint;
import com.BISEN.JANMAT.modelsPackage.Minister;
import com.BISEN.JANMAT.modelsPackage.User;
import com.BISEN.JANMAT.repositoryPackage.ComplaintRepository;
import com.BISEN.JANMAT.repositoryPackage.MinisterRepository;
import com.BISEN.JANMAT.repositoryPackage.UserRepository;

@Service
public class ComplaintServiceImpl implements ComplaintService {
    @Autowired
    ComplaintRepository complaintRepo;
    @Autowired
    UserRepository userRepo;
    @Autowired
    MinisterRepository ministerRepo;

    @Override
    public Complaint saveComplaint(Complaint complaint) {
        Long userId = complaint.getUser().getUserId();
        Long ministerId = complaint.getMinister().getMinisterId();

        //fetch existing user
        User existingUser = userRepo.findById(userId).orElseThrow(()-> new RuntimeException("user not found"));
        Minister existingMinister = ministerRepo.findById(ministerId).orElseThrow(()-> new RuntimeException("Minister not found"));

        complaint.setUser(existingUser);
        complaint.setMinister(existingMinister);
        
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

        Long userId = updatedComplain.getUser().getUserId();
        Long ministerId = updatedComplain.getMinister().getMinisterId();

        updatedComplain.setUser(userRepo.findById(userId).orElseThrow(()-> new RuntimeException("User not found")));
        updatedComplain.setMinister(ministerRepo.findById(ministerId).orElseThrow(()-> new RuntimeException("Minister not found")));

        Complaint existingComplain = complaintRepo.findById(id).orElse(null);
        if(existingComplain!= null){
            existingComplain.setUser(updatedComplain.getUser());
            existingComplain.setMinister(updatedComplain.getMinister());
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
