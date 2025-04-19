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
@RequestMapping("/complaintresponses")
@RestController
public class ComplaintResponseController {

    @Autowired
    ComplaintResponseService comprespserv;

    @PostMapping
    public ResponseEntity<ComplaintResponse> createComplaintResponse(@RequestBody ComplaintResponse response) {
        return ResponseEntity.ok(comprespserv.saveComplaintResponse(response));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ComplaintResponse> getComplaintResponse(@PathVariable Long id) {
        return ResponseEntity.ok(comprespserv.getComplaintResponseById(id));
    }

    @GetMapping
    public ResponseEntity<List<ComplaintResponse>> getAllComplaintResponse() {
        return ResponseEntity.ok(comprespserv.getAllComplaintResponse());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ComplaintResponse> upsateComplaintResponse(@PathVariable Long id,
            @RequestBody ComplaintResponse response) {
        return ResponseEntity.ok(comprespserv.updateComplaintResponse(response, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteComResponseByID(@PathVariable Long id) {
        comprespserv.deleteComplaintResponse(id);
        return ResponseEntity.ok("Complaint Response Deleted Successfully");
    }

}
