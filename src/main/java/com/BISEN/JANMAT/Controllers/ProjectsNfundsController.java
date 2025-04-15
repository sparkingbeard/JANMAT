package com.BISEN.JANMAT.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BISEN.JANMAT.Services.ProjectNfundsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@CrossOrigin("http://localhost:4200")
@RequestMapping("/projectsnfunds")
@RestController
public class ProjectsNfundsController {
    @Autowired ProjectNfundsService project;

    @PostMapping("path")
    public String postMethodName(@RequestBody String entity) {
        //TODO: process POST request
        
        return entity;
    }

    @GetMapping("path")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    @GetMapping("path")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }

    @PutMapping("path/{id}")
    public String putMethodName(@PathVariable String id, @RequestBody String entity) {
        //TODO: process PUT request
        
        return entity;
    }

    @DeleteMapping("/projectsnfunds/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id){
        project.deleteProjectsNfunds(id)
        ResponseEntity.ok("Project Deleted Successfully");
    }

    
    
    
}
