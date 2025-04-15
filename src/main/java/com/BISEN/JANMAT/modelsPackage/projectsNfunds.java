package com.BISEN.JANMAT.modelsPackage;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name = "projectsAndFunds")
public class ProjectsNfunds {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long projectId; 
    @OneToOne
    @Column(nullable = false, unique = true)
    private Long ministerId; 
    @Column(nullable = false)
    private String description; 
    @Column(nullable = false)
    private String startDate; 
    @Column(nullable = false)
    private String endDate; 
    @Column(nullable = false)
    private Long allocateAmount;
    @Column(nullable = false) 
    private Long spentAmount;
    @Enumerated
    @Column(nullable = false) 
    private EnumProjectsNfunds projectStatus; 
}
