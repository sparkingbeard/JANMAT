package com.BISEN.JANMAT.Services;

import java.util.List;

import com.BISEN.JANMAT.modelsPackage.Complaint;

public interface ComplaintService {
    Complaint saveComplaint(Complaint complaint);

    Complaint getComplaint(Long id);

    List<Complaint> getAllComplaints();

    Complaint updateComplaint(Long id, Complaint complain);

    void deleteComplaint(Long id);
}
