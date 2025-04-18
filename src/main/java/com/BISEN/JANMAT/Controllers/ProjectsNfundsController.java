package com.BISEN.JANMAT.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BISEN.JANMAT.Services.ProjectNfundsService;
import com.BISEN.JANMAT.modelsPackage.ProjectsNfunds;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@CrossOrigin("http://localhost:4200")
@RequestMapping("/projectsnfunds")
@RestController
public class ProjectsNfundsController {
    @Autowired ProjectNfundsService project;

    @PostMapping("/projectsnfunds")
    public ResponseEntity<ProjectsNfunds> postMethodName(@RequestBody ProjectsNfunds pro) {
       return ResponseEntity.ok( project.createProjectsNfunds(pro));
    }

    @GetMapping("/projectsnfunds/{id}")
    public ResponseEntity<ProjectsNfunds> getProjectById(@PathVariable Long id) {
       return ResponseEntity.ok(project.getProjectsNfundsById(id));
    }
    @GetMapping("/projectsnfunds")
    public ResponseEntity<List<ProjectsNfunds>> getAllProjects() {
        return ResponseEntity.ok(project.getAllProjectsNfunds());
    }

    @PutMapping("/projectsnfunds/{id}")
    public ResponseEntity<ProjectsNfunds> updateProjectById(@RequestBody ProjectsNfunds pro, @PathVariable Long id) {
          return ResponseEntity.ok(project.updateProjectsNfunds(pro, id));
    }

    @DeleteMapping("/projectsnfunds/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id){
        project.deleteProjectsNfunds(id);
        return ResponseEntity.ok("Project Deleted Successfully");
    }

    
    
    
}
