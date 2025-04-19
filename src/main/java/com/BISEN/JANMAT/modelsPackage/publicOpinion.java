package com.BISEN.JANMAT.modelsPackage;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Public_Opinion")
public class PublicOpinion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long opinionId;
    @JoinColumn(nullable = false)
    @OneToOne
    private Minister ministerId;
    @OneToOne
    private User userId;
    @Enumerated
    @Column(nullable = false)
    private ENUMpublicOpinionVotes votes;
}
