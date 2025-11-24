package tn.esprit.spring.crud_event.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.crud_event.model.Feedback;
import tn.esprit.spring.crud_event.repo.FeedbackRepository;

import java.util.List;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepository repo;

    public Feedback addFeedback(Feedback f) {
        return repo.save(f);
    }

    public List<Feedback> getFeedbacksForEvent(Long eventId) {
        return repo.findByIdEvent(eventId);
    }
}
