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
@Table(name = "publicOpinion")
public class PublicOpinion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long opinionId;
    @Column
    @OneToOne
    private Long ministerId;
    @Column
    @OneToOne
    private Long userId;
    @Enumerated
    private ENUMpublicOpinionVotes votes;
}
