package com.BISEN.JANMAT.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BISEN.JANMAT.Services.ComplaintService;
import com.BISEN.JANMAT.modelsPackage.Complaint;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;



@CrossOrigin("http://localhost:4200")
@RequestMapping("/complaint")
@RestController
public class ComplaintController {

    @Autowired
    ComplaintService compserv;

    @PostMapping("/complaint")
    public ResponseEntity<Complaint> createComplaint(@RequestBody Complaint complain) {
        return ResponseEntity.ok(compserv.saveComplaint(complain));
    }
    
    @GetMapping("/complaint/{id}")
    public ResponseEntity<Complaint> getComplaint(@PathVariable Long id) {
        return  ResponseEntity.ok(compserv.getComplaint(id));
    }
    @GetMapping("/complaint")
    public ResponseEntity<List<Complaint>> getMethodName() {
        return ResponseEntity.ok(compserv.getAllComplaints());
    }

    @PutMapping("complaint/{id}")
    public ResponseEntity<Complaint> updateComplaint(@PathVariable Long id, @RequestBody Complaint complain) {
       return ResponseEntity.ok(compserv.updateComplaint(id, complain));
    }
    
    @DeleteMapping("/complaint/{id}")
    public ResponseEntity<String> deleteByID(@PathVariable Long id){
        compserv.deleteComplaint(id);
        return ResponseEntity.ok("Complaint Deleted Successfully");
    }
    
}
