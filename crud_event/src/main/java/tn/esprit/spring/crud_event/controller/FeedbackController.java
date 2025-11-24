package tn.esprit.spring.crud_event.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.crud_event.model.Event;
import tn.esprit.spring.crud_event.model.Feedback;
import tn.esprit.spring.crud_event.service.FeedbackService;
import tn.esprit.spring.crud_event.service.EventService;

import java.util.List;

@RestController
@RequestMapping("/api/feedback")
@CrossOrigin(origins = "http://localhost:4200")
public class FeedbackController {

    @Autowired
    private FeedbackService service;

    @PostMapping
    public Feedback add(@RequestBody Feedback feedback) {
        return service.addFeedback(feedback);
    }

    @GetMapping("/event/{idEvent}")
    public List<Feedback> getByEvent(@PathVariable Long idEvent) {
        return service.getFeedbacksForEvent(idEvent);
    }



}
