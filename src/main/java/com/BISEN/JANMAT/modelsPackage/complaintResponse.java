package com.BISEN.JANMAT.modelsPackage;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name = "Complaint_Responses")
public class ComplaintResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long responseId;
    @OneToOne
    @JoinColumn(nullable = false)
    private Minister ministerId;
    @OneToOne
    @JoinColumn(nullable = false)
    private Complaint complaintId;
    @Column(nullable = false)
    private String responseText;
    @Column(nullable = false)
    private String timestamp;
    
}
