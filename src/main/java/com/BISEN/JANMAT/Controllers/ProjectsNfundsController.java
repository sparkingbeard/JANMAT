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

    @PostMapping
    public ResponseEntity<ProjectsNfunds> createProject(@RequestBody ProjectsNfunds pro) {
       return ResponseEntity.ok( project.createProjectsNfunds(pro));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProjectsNfunds> getProject(@PathVariable Long id) {
       return ResponseEntity.ok(project.getProjectsNfundsById(id));
    }
    @GetMapping
    public ResponseEntity<List<ProjectsNfunds>> getAllProjects() {
        return ResponseEntity.ok(project.getAllProjectsNfunds());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProjectsNfunds> updateProject(@RequestBody ProjectsNfunds pro, @PathVariable Long id) {
          return ResponseEntity.ok(project.updateProjectsNfunds(pro, id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProject(@PathVariable Long id){
        project.deleteProjectsNfunds(id);
        return ResponseEntity.ok("Project Deleted Successfully");
    }

    
    
    
}
