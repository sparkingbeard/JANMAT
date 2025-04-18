package com.BISEN.JANMAT.Services;

import java.util.List;

import com.BISEN.JANMAT.modelsPackage.PollFeedback;

public interface PollFeedbackService {

    PollFeedback createPollFeedBack(PollFeedback feedback);
    PollFeedback getPollFeedbackById(Long id);
    List<PollFeedback> getAllPollFeedback();
    PollFeedback updatePollFeedback(Long id, PollFeedback feedback);
    void deletePollFeedbackById(Long id);
}
