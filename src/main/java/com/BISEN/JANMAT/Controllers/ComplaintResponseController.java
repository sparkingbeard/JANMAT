package com.BISEN.JANMAT.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BISEN.JANMAT.Services.ComplaintResponseService;
import com.BISEN.JANMAT.modelsPackage.ComplaintResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PutMapping;

@CrossOrigin("http://localhost:4200")
@RequestMapping("/complaintresponse")
@RestController
public class ComplaintResponseController {

    @Autowired
    ComplaintResponseService comprespserv;

    @PostMapping("/complaintresponse")
    public ResponseEntity<ComplaintResponse> createComplaintResponse(@RequestBody ComplaintResponse response) {
        return ResponseEntity.ok(comprespserv.saveComplaintResponse(response));
    }

    @GetMapping("/complaintresponse/{id}")
    public ResponseEntity<ComplaintResponse> getComplaintResponseById(@PathVariable Long id) {
        return ResponseEntity.ok(comprespserv.getComplaintResponseById(id));
    }

    @GetMapping("/complaintresponse/{id}")
    public ResponseEntity<List<ComplaintResponse>> getAllComplaintResponse() {
        return ResponseEntity.ok(comprespserv.getAllComplaintResponse());
    }

    @PutMapping("complaintresponse/{id}")
    public ResponseEntity<ComplaintResponse> putMethodName(@PathVariable Long id,
            @RequestBody ComplaintResponse response) {
        return ResponseEntity.ok(comprespserv.updateComplaintResponse(response, id));
    }

    @DeleteMapping("/complaintresponse")
    public ResponseEntity<String> deleteComResponseByID(Long id) {
        comprespserv.deleteComplaintResponse(id);
        return ResponseEntity.ok("Complaint Response Deleted Successfully");
    }

}
