package com.BISEN.JANMAT.modelsPackage;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "complaints")
public class Complaint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long complaintId;
   @JoinColumn(name = "user_id", nullable = false)
   @ManyToOne
   private User user;
   @JoinColumn(name = "minister_id", nullable = false)
   @ManyToOne
   private Minister minister;
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
