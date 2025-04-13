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
@Table(name = "pollFeedback")
public class pollFeedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long complainPollId;
    @OneToOne
    private Long userId;
    @OneToOne
    private Long compliantId;
    @Column(nullable = false)
    private ENUMfeedback feedback;
}
