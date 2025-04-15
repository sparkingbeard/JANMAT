package com.BISEN.JANMAT.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BISEN.JANMAT.Services.MinisterService;
import com.BISEN.JANMAT.modelsPackage.Minister;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@CrossOrigin("http://localhost:4200")
@RequestMapping("/minister")
@RestController
public class MinisterController {

    @Autowired
    MinisterService ministerserv;

    @PostMapping("/minister")
    public ResponseEntity<Minister> postMethodName(@RequestBody Minister minister) {
        return ResponseEntity.ok(ministerserv.createMinister(minister));
    }
    @GetMapping("Minister/{id}")
    public ResponseEntity<Minister> getMinisterByIdString(@PathVariable Long id) {
        return ResponseEntity.ok(ministerserv.getMinisterById(id));
    }
    @GetMapping("Minister")
    public ResponseEntity<List<Minister>> getAllMinisters() {
        return ResponseEntity.ok(ministerserv.getAllMinister());
    }
    
    @PutMapping("path/{id}")
    public ResponseEntity<Minister> putMethodName(@PathVariable Long id, @RequestBody Minister minster) {
        return ResponseEntity.ok(ministerserv.updateMinisterById(id, minster));
    }
    @DeleteMapping("/minister/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id){
        ministerserv.deleterMinisterById(id);
        return ResponseEntity.ok("Minister Deleted Successfully");
    };
    
    

}
