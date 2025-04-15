package com.BISEN.JANMAT.Services;

import java.util.List;

import com.BISEN.JANMAT.modelsPackage.ComplaintResponse;

public interface ComplaintResponseService {
    ComplaintResponse saveComplaintResponse(ComplaintResponse complaintResponse);
    ComplaintResponse getComplaintResponseById(Long id);
    List<ComplaintResponse> getAllComplaintResponse();
    ComplaintResponse updateComplaintResponse(ComplaintResponse complaintResponse, Long id);
    void deleteComplaintResponse(Long id);


}
