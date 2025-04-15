package com.BISEN.JANMAT.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BISEN.JANMAT.modelsPackage.ComplaintResponse;
import com.BISEN.JANMAT.repositoryPackage.ComplaintResponseRepository;

@Service
public class ComplaintResponseServiceImpl implements ComplaintResponseService{

    @Autowired
    ComplaintResponseRepository compresprepo;
    @Override
    public ComplaintResponse saveComplaintResponse(ComplaintResponse complaintResponse) {
        return compresprepo.save(complaintResponse);
  }

    @Override
    public ComplaintResponse getComplaintResponseById(Long id) {
       return compresprepo.findById(id).orElse(null);
    }

    @Override
    public List<ComplaintResponse> getAllComplaintResponse() {
        return compresprepo.findAll();
    }

    @Override
    public ComplaintResponse updateComplaintResponse(ComplaintResponse updatedResponse, Long id) {
        ComplaintResponse existingResponse = compresprepo.findById(id).orElse(null);
        if(existingResponse != null){
        existingResponse.setResponseText(updatedResponse.getResponseText());
        existingResponse.setTimestamp(updatedResponse.getTimestamp());
        return compresprepo.save(existingResponse);
        }
        return null;
    }

    @Override
    public void deleteComplaintResponse(Long id) {
      compresprepo.deleteById(id);
    }

}
