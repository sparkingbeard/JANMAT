package com.BISEN.JANMAT.modelsPackage;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name = "complaints")
public class Complaint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long complaintId;
   @ManyToOne
   private User userId;
   @ManyToOne
   private Minister ministerId;
   @Column(nullable = false)
   private String subject;
   @Column(nullable = false)
   private String description;
   @Enumerated
   @Column(nullable = false)
   private ENUMcomplaintStatus status;
   @Column(nullable = false)
   private String timestamp;
}
