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
@Table(name = "Poll_Feedback")
public class PollFeedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long complainPollId;
    @OneToOne
    private User userId;
    @OneToOne
    private Complaint compliantId;
    @Column(nullable = false)
    @Enumerated
    private ENUMfeedback feedback;
}
