package com.BISEN.JANMAT.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BISEN.JANMAT.Services.PublicOpinionService;
import com.BISEN.JANMAT.modelsPackage.PublicOpinion;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@CrossOrigin("http://localhost:4200")
@RequestMapping("/public-opinion")
@RestController
public class PublicOpinionController {

    @Autowired
    PublicOpinionService poserv;

    @PostMapping("/public-opinion")
    public ResponseEntity<PublicOpinion> createPublicOpinion(@RequestBody PublicOpinion opinion) {
        return ResponseEntity.ok(poserv.createPublicOpinion(opinion));
    }

    @GetMapping("/public-opinion/{id}")
    public ResponseEntity<PublicOpinion> getPublicOpinionById(@PathVariable Long id) {
        return ResponseEntity.ok(poserv.getOpinionById(id));
    }
    @GetMapping("/public-opinion")
    public ResponseEntity<List<PublicOpinion>> getPublicOpinion() {
        return ResponseEntity.ok(poserv.getAllOpinion());
    }
    
    @PutMapping("/public-opinion/{id}")
    public ResponseEntity<PublicOpinion> updatePublicOpinion(@PathVariable Long id, @RequestBody PublicOpinion Opinion) {
       return ResponseEntity.ok(poserv.updateOpinion(id, Opinion));
    }

    @DeleteMapping("/public-opinion/ {id}")
    public ResponseEntity<String> deletePublicOpinionById(@PathVariable Long id){
        poserv.deleteById(id);
        return ResponseEntity.ok("Opinion Deleted Successfully");

    }
}
