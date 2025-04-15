package com.BISEN.JANMAT.modelsPackage;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name = "complaintResponse")
public class ComplaintResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long responseId;
    @OneToOne
    @Column
    private Long ministerId;
    @OneToOne
    @Column
    private Long complainId;
    @Column(nullable = false)
    private String responseText;
    @Column(nullable = false)
    private String timestamp;
    
}
